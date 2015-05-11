//EXERCÍCIO 01
function brewdog(firstStr, secondStr) {
	var menor = firstStr.length < secondStr.length ? firstStr : secondStr;
	var maior = firstStr.length >= secondStr.length ? firstStr : secondStr;
	var cont = 0;

	menor = menor.split("");
	maior = maior.split("");

	menor.forEach(
		function(a) {
			if (maior.indexOf(a) < 0) cont++;
		});

	maior.forEach(
		function(b) {
			if (menor.indexOf(b) < 0) cont++;
		});

	return cont;
}

brewdog("bacon", "beico");

var vetor = [
	{parametro: ["american ipa", "american ipa"], esperado: 0},
	{parametro: ["russian imperial stout", "russian imperial vodka"], esperado: 5},
	{parametro: ["1002012", "dfgdf12"], esperado: 5},
	{parametro: ["k4rol1n", "k4thr1n"], esperado: 3},
	{parametro: ["a1df222266%334op", "ssdfjfdkjgsdfgofdgudf9g8dufsg"], esperado: 26}
	];

vetor.forEach(
	function(a) {
		var resultado = brewdog(a.parametro[0], a.parametro[1]);
		console.assert(resultado === a.esperado,
						"Erro! Item Atual: ", a.parametro,
						"Esperado: ", a.esperado,
						"Obtido: ", resultado);
	});
//---------------------------------------------------


//EXERCÍCIO 02
function Emprestimo(valor, juros, parcelas) {
	this.valor = valor;
	this.juros = juros;
	this.parcelas = parcelas || 3;

	this.valorParcela = function() {
		var p = Math.ceil(this.valor /
				(((Math.pow(1 + this.juros, this.parcelas)) - 1) /
				((Math.pow(1 + this.juros, this.parcelas)) * this.juros)) * 100) / 100;
		return p;
	}
}

var emp01 = new Emprestimo(1000, 0.03, 4);
var emp02 = new Emprestimo(500, 0.05);

emp01.valorParcela();
//---------------------------------------------------