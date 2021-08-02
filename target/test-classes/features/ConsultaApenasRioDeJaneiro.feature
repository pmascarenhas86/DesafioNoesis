# language: pt
@TestesUnimed
@Teste1
Funcionalidade: Validar a apresentação dos resultados com a Especialidade e Cidade

  Cenário: : Realizar consulta de medicos apenas da UF: RJ
    Dado que eu acesse a Pagina da Unimed
      E clique em Encontre um Medico
      E efetue uma consulta avançada por Médicos no Rio de Janeiro
      Então devo conseguir verificar a Especialidade e a Cidade do Médico localizado