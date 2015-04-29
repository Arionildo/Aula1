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


--------------------------------------------------------------
select
	pm.IDProduto,
	p.Nome,
	sum(isnull(pm.Quantidade, 1) * m.PrecoCusto) "Custo Materiais"
from
	Produto p,
	Material m,
	ProdutoMaterial pm
where
	p.IDProduto = pm.IDProduto and
	m.IDMaterial = pm.IDMaterial
group by pm.IDProduto, p.Nome
order by "Custo Materiais" desc;


--------------------------------------------------------------
--Continuar


--------------------------------------------------------------
select
	p.IDProduto,
	p.Nome,
	SUM(i.Quantidade) "Vendas"
from 
	Produto p,
	PedidoItem i
where p.IDProduto = i.IDProduto
group by
	p.IDProduto,
	p.Nome
order by "Vendas" desc;
	
	
-------------------------------------------------------------
create index IX_PedidoItem_Produto on PedidoItem(IDProduto)