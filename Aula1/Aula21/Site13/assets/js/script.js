var a = { "nome": "Arionildo" };
var b = { "resposta": "10" };
var c = { "resposta": "186" };

$.ajax({
	url: 'http://illuminati.instaweb.com.br:6789/autentica',
	type: 'POST',
	contentType: 'application/json',
	data: JSON.stringify(a)
}).done(function(y){
	console.log(y)
});

$.ajax({
	url: 'http://illuminati.instaweb.com.br:6789/exercicios?token=d495d70947ae',
	type: 'POST',
	contentType: 'application/json',
	data: JSON.stringify(b)
}).done(function(y){
	console.log(y)
});

$.ajax({
	url: 'http://illuminati.instaweb.com.br:6789/exercicios?token=d495d70947ae',
	type: 'POST',
	contentType: 'application/json',
	data: JSON.stringify(c)
}).done(function(y){
	console.log(y)
});

$.ajax({
	url: 'http://illuminati.instaweb.com.br:6789/exercicios?token=d495d70947ae',
	type: 'GET'
}).done(function(y){
	console.log(y)
});

var vetor = [59,29,24,55,1,92,39,78,52,32,5,88,89,56,29,
    19,8,97,74,38,15,68,70,29,24,60,14,41,64,45,86,1,79,43,
    72,80,1,44,98,40,32,47,53,25,21,51,86,7,65,30,68,32,44,
    88,45,78,49,29,41,13,48,66,41,98,58,86,5,61,72,56,99,5,
    90,37,21,30,0,59,6,70,94,3,54,45,37,
    69,
    41,
    55,
    86,
    15,
    17,
    80,
    75,
    34,
    24,
    93,
    90,
    86,
    83,
    42
  ];