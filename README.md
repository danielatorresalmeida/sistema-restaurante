# Sistema de Gestão de Restaurante

Este projeto foi desenvolvido no âmbito da UFCD/UC 10789 - Metodologias de Desenvolvimento de Software.

O objetivo do projeto é criar um sistema de gestão para restaurante, permitindo organizar reservas, mesas, pedidos, menu e colaboradores.

O sistema pretende ajudar um restaurante a trabalhar de forma mais organizada, centralizando a informação principal num único local. Por exemplo, será possível acompanhar reservas recentes, consultar mesas disponíveis, gerir pedidos em preparação e visualizar o estado dos pedidos.

## Funcionalidades previstas

- Gestão de reservas
- Gestão de mesas
- Gestão de pedidos
- Estados dos pedidos
- Gestão do menu
- Login de utilizadores
- Gestão de colaboradores
- Testes TDD para validação de funcionalidades

## Estados dos pedidos

Os pedidos do restaurante poderão passar por vários estados:

- Em espera: o pedido foi criado, mas ainda aguarda a aceitação da cozinha.
- Em preparação: o pedido foi aceite pelo chef e está a ser preparado.
- Na roda: o prato já foi confecionado, mas ainda não foi recolhido pela sala.
- Em expedição: o prato foi recolhido por um empregado de mesa e está a ser entregue.
- Entregue: o pedido foi entregue ao cliente.

## Organização inicial do projeto

A estrutura inicial do repositório será organizada da seguinte forma:

- src: código principal do projeto.
- test: testes realizados no projeto.
- README.md: descrição geral do projeto.

## Metodologia utilizada

O grupo decidiu utilizar a metodologia Scrum para organizar o desenvolvimento do projeto.

O Scrum permite dividir o trabalho em pequenas tarefas, acompanhar o progresso do grupo e organizar melhor as funcionalidades a desenvolver.

A organização do trabalho será feita através de:

- Product Backlog, com todas as funcionalidades previstas.
- Sprint Backlog, com as tarefas selecionadas para cada fase de trabalho.
- Sprints, para desenvolver partes específicas do sistema.
- Revisão das tarefas concluídas.
- Melhoria contínua do trabalho do grupo.

## Controlo de versões

O controlo de versões será realizado através do Git e do GitHub.

A branch principal do projeto será:
main

Também serão utilizadas branches para organizar o desenvolvimento das funcionalidades, como por exemplo:

login-feature
reservas-feature
pedidos-feature
mesas-feature
menu-feature

Cada elemento do grupo deverá realizar commits com mensagens claras, indicando as alterações feitas no projeto.

Tecnologias utilizadas
Git
GitHub
Figma
Scrum
XP
TDD
Elementos do grupo
Daniela Almeida
Frederico Castelhano
Lucas Celli
Links do projeto

Repositório GitHub:

https://github.com/danielatorresalmeida/sistema-restaurante

Protótipo no Figma:

[https://www.figma.com/design/aIV7smzh69HzackoUm7ARW/Restaurante?node-id=1-3&p=f&t=TpWEcDJwnVnQYTxI-0]

Observações

Este projeto encontra-se em desenvolvimento académico. Algumas funcionalidades poderão ser ajustadas ao longo do trabalho, de acordo com a evolução do protótipo, dos testes e das decisões do grupo.

A mensagem do commit para esta alteração pode ser:

Atualizar README com metodologia Scrum e links do projeto
