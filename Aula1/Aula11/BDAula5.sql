--Exercicio 4
select distinct
	Situacao,
	COUNT(1) "Valores"
from Produto
group by Situacao;


--------------------------------------------------------------
select
	Nome,
	RazaoSocial
from Cliente
where
	RazaoSocial like '%LTDA%' OR
	RazaoSocial like '%LTDA';
	

--------------------------------------------------------------	
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
	

--------------------------------------------------------------
select
	p.Nome
from
	Produto p
where not exists(
		select 1
		from PedidoItem i
		where p.IDProduto = i.IDProduto);
		

--------------------------------------------------------------
select top 1
	ci.UF,
	COUNT(1) "Maior número de clientes"
from
	Cliente cl,
	Cidade ci
where cl.IDCidade=ci.IDCidade
group by ci.UF
order by "Maior número de clientes" desc;


---------------------------------------------------------------
create view MaiorNroClientes as
select top 1
	ci.UF,
	COUNT(1) "Maior número de clientes"
from
	Cliente cl,
	Cidade ci
where cl.IDCidade=ci.IDCidade
group by ci.UF
order by "Maior número de clientes" desc;

create view MenorNroClientes as
select top 1
	ci.UF,
	COUNT(1) "Menor número de clientes"
from
	Cliente cl,
	Cidade ci
where cl.IDCidade=ci.IDCidade
group by ci.UF
order by "Menor número de clientes" asc;

select * from MaiorNroClientes, MenorNroClientes;


--------------------------------------------------------------
select
	count(distinct ci.nome) "Total de Cidades"
from
	cidade ci,
	Cliente cl,
	Pedido p
where
	ci.IDCidade = cl.IDCidade and
	cl.IDCliente = p.IDCliente;


--------------------------------------------------------------
select
	p.Nome
from
	Produto p
where not exists(
		select 1
		from ProdutoMaterial m
		where p.IDProduto = m.IDProduto);


-------------------------------------------------------------
/*
select
	p.Nome,
	p.PrecoCusto,
	(select
		isnull(sum(m.PrecoCusto), 0)
	from Material m) "Total Custo Materiais"
from
	Produto p,
	ProdutoMaterial m
where p.IDProduto = m.IDProduto;
*/