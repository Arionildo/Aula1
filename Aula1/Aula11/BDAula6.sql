--Exercicio 1
begin
	declare
		@vNome varchar(10),
		@vQuantidade int
		
	select top 1
		@vNome = p.Nome,
		@vQuantidade = SUM(i.Quantidade)
	from 
		Produto p,
		PedidoItem i
	where p.IDProduto = i.IDProduto
	group by
		p.IDProduto,
		p.Nome
	order by SUM(i.Quantidade) desc;

	print 'O produto '+ @vNome +' teve '+ cast(@vQuantidade as varchar(10)) + ' unidades vendidas'
end;
--------------------------------------------------------------


--Exercicio 2
begin
	select
		ci.Nome,
		ci.UF,
		COUNT(1) "Quantidade"
	from
		Cidade ci,
		Cliente cl
	where ci.IDCidade = cl.IDCidade
	group by
		ci.Nome,
		ci.UF
	having COUNT(1) > 1
end;
/*
BEGIN
	DECLARE ListaCidade CURSOR
	Local
	Fast_Forward
	FOR Select Nome, Uf
		From Cidade
		Group by Nome, Uf
		Having COUNT(1) > 1;
	DECLARE @vNome varchar(50),
			@vUF varchar(2)
	OPEN ListaCidade;
	FETCH NEXT FROM ListaCidade INTO @vNome, @vUF
	WHILE (@@FETCH_STATUS=0) BEGIN
	Print @vNome + '/'+@vUF;
	FETCH NEXT FROM ListaCidade INTO @vNome, @vUF
	END
	CLOSE ListaCidade;
	DEALLOCATE ListaCidade;
END
*/
--------------------------------------------------------------


--Exercicio 3
create view vw_Materiais_Mais_Usados as
select top 1
	m.IDMaterial,
	m.Descricao,
	COUNT(1) "Usado"
from
	Material m,
	ProdutoMaterial pm
where m.IDMaterial = pm.IDMaterial
group by
	m.IDMaterial,
	m.Descricao
order by "Usado" desc;

select
	p.IDProduto,
	p.Nome
from
	Produto p,
	ProdutoMaterial pm
where
	p.IDProduto = pm.IDProduto and
	pm.IDMaterial in (
		select IDMaterial from vw_Materiais_Mais_Usados);
--------------------------------------------------------------