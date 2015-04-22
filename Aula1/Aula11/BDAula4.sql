select
	e.IDEmpregado,
	e.NomeEmpregado,
	d.NomeDepartamento
from Empregado e
inner join Departamento d
on d.IDDepartamento = e.IDDepartamento;
/*
select
	e.IDEmpregado,
	e.NomeEmpregado,
	d.NomeDepartamento
from
	Empregado e,
	Departamento d
where e.IDDepartamento = d.IDDepartamento;
*/


select
	e.IDEmpregado,
	e.NomeEmpregado,
	d.NomeDepartamento
from Empregado e
left join Departamento d
on d.IDDepartamento = e.IDDepartamento;


select
	e.IDEmpregado,
	e.NomeEmpregado,
	e.IDGerente,
	g.NomeEmpregado
from Empregado e
inner join Empregado g
on e.IDGerente = g.IDGerente;



--Exercicios 3
update associado
set idcidade = 1
where idassociado = 1;

update associado
set idcidade = 32
where idassociado = 2;


select
	e.NomeEmpregado,
	d.NomeDepartamento
from
	Empregado e,
	Departamento d
where e.IDDepartamento = d.IDDepartamento;


select
	a.Nome,
	c.Nome
from
	Associado a
left join Cidade c
on a.IDCidade = c.IDCidade;


select
	c.UF,
	count(1) "Total de Cidades"
from
	Cidade c,
	Associado a
where a.IDCidade != c.IDCidade
group by c.UF;


select
	a.Nome,
	c.Nome,
	case
		when UF IN('RS', 'SC', 'PR')then '***'
		else null
	end "Região Sul"
from
	Associado a,
	Cidade c
where a.IDCidade = c.IDCidade;


select
	e.NomeEmpregado,
	dEmp.NomeDepartamento,
	g.NomeEmpregado,
	dGer.NomeDepartamento
from
	Empregado e,
	Empregado g,
	Departamento dEmp,
	Departamento dGer
where
	e.IDDepartamento = dEmp.IDDepartamento and
	g.IDEmpregado = e.IDGerente and
	g.IDDepartamento = dGer.IDDepartamento;