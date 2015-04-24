--Exercicio 4
select distinct
	Situacao,
	COUNT(1) "Valores"
from Produto
group by Situacao;


select
	Nome,
	RazaoSocial
from Cliente
where
	RazaoSocial like '%LTDA%' OR
	RazaoSocial like '%LTDA';
	
	
insert into Produto(
	Nome,
	PrecoCusto,
	PrecoVenda,
	Situacao)
values(
	'Galocha Maragato',
	35.67,
	77.95,
	'A');