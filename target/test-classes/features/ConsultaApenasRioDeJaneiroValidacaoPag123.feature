# language: pt
@TestesUnimed
@Teste2
Funcionalidade: Verificar resultados nas paginas 1,2,3

  Cenário: : Realizar consulta de medicos apenas da UF: RJ
    Dado que eu acesse a Pagina da Unimed
    E clique em Encontre um Medico
    E efetue uma consulta avançada por Médicos no Rio de Janeiro
    Então devo conseguir verificar a Especialidade e a Cidade do Médico localizado
    E validar que nas paginas 1,2 e 3 nao exista retorno de São Paulo