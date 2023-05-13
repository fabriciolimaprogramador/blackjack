const url = "http://localhost:8080/black-jack"

const tbody = document.querySelector("#lista-cartas-puxadas")
const pontosAcumulados = document.querySelector("#pontos-acumulados")
const pontuacao = document.querySelector("#pontuacao")
const finalizado = document.querySelector("#finalizado")
const mensagens = document.querySelector("#mensagens")

async function embaralharCartas() {
	console.log("Embaralhar cartas");
	const response = await fetch(url + "/embaralhar-cartas");
	console.log(response);
	const data = await response.json();
	console.log(data);

	pontosAcumulados.innerText = "";
	pontuacao.innerText = "";
	finalizado.innerText = "";

	while (tbody.hasChildNodes()) {
		tbody.removeChild(tbody.firstChild);
	}

	alert(data.mensagem);
}

async function puxarUmaCarta() {
	console.log("Puxar uma carta");
	const response = await fetch(url + "/puxar-uma-carta-do-baralho");
	console.log(response);
	const data = await response.json();
	console.log(data);

	console.log(response.status);


	if (response.status === 206) {
		finalizado.innerText = data.mensagem;
		alert(data.mensagem);
		return;
	}

	const tr = document.createElement("tr");
	const tdNumero = document.createElement("td");
	const tdNaipe = document.createElement("td");
	const tdCor = document.createElement("td");
	const tdImagem = document.createElement("td");
	const imgCarta = document.createElement("img");


	tdNumero.innerText = data.numero;
	tdNaipe.innerText = data.naipe;
	tdCor.innerText = data.cor;


	imgCarta.src = ("img/" + data.numero + "-" + data.naipe + ".jpg").toLowerCase();
	imgCarta.width = "107";
	imgCarta.height = "98";
	tdImagem.appendChild(imgCarta);

	tr.appendChild(tdNumero);
	tr.appendChild(tdNaipe);
	tr.appendChild(tdCor);
	tr.appendChild(tdImagem);

	tbody.appendChild(tr);

	getPontosAcumulados();
	getPontuacao();

}

async function getPontosAcumulados() {
	console.log("Pontos acumulados");
	const response = await fetch(url + "/pontos-acumulados");
	console.log(response);
	const data = await response.json();
	console.log(data);
	pontosAcumulados.innerText = "Pontos acumulados " + data.mensagem;

	if(data.mensagem <= 21){
		mensagens.style.backgroundColor = "#04AA6D";
	} else {
		mensagens.style.backgroundColor = "#FF0F0F";
	}

	
	
}

async function getPontuacao() {
	console.log("Pontuação");
	const response = await fetch(url + "/pontuacao");
	console.log(response);
	const data = await response.json();
	console.log(data);
	pontuacao.innerText = data.mensagem;
}


