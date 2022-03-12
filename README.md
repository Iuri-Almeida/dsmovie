<div align='center'>
  
  <img width="500" src="https://user-images.githubusercontent.com/60857927/158011975-161ea0a1-b8ec-407c-bfcc-4774ae9326f3.png" />
  
</div>

<div align = "center">

<p>

  <a href="#descricao">Descrição</a> &#xa0; | &#xa0;
  <a href="#tecnologias">Tecnologias</a> &#xa0; | &#xa0;
  <a href="#requisitos">Requisitos</a> &#xa0; | &#xa0;
  <a href="#executando">Executando</a> &#xa0; | &#xa0;
  <a href="#referencias">Referências</a>

</p>

</div>

<div id = "descricao">

## :pushpin: Descrição ##

<p>

  Esse é o repositório do projeto DSMovie da trilha profissionalizante, desenvolvido durante a Semana Spring React comandada pela [Dev Superior][dev_superior] entre os dias 07/03/2022 e 13/03/2022.

  Esse projeto consiste no desenvolvimento de uma aplicação para listagem e avaliações de filmes. Foi utilizado o framework [ReactJS][reactjs] para o desenvolvimento do front-end, o [Spring Boot][spring_boot] para o back-end e os Bancos de Dados [H2][h2] para testes e [PostgreSQL][postgresql] para o ambiente de desenvolvimento e produção.

  O front-end da aplicação foi publicado no [Netlify][netlify] e está no ar [neste endereço][link_netlify]. Já para o back-end, foi utilizado a plataforma do [Heroku][heroku] e está rodando [neste endereço][link_heroku].

</p>

</div>

<div id = "tecnologias">

## :rocket: Tecnologias ##

Todas as tecnologias usadas na realização do projeto:

* [Java][java] [Versão 11]
* [IntelliJ][intellij]
* [ReactJS][reactjs]
* [Spring Boot][spring_boot]
* [H2][h2]
* [PostgreSQL][postgresql]
* [Netlify][netlify]
* [Heroku][heroku]

</div>

<div id = "requisitos">

## :warning: Requisitos ##

<p>

  Antes de executar, você precisar ter o [Git][git], [Java][java] (Versão 11), [NodeJS][nodejs] (Versão 16.13.1) e [Yarn][yarn], bem como o JDK do Java 11 instalados na sua máquina.

</p>

<p><b>Obs.:</b> Caso não tenha o <i>yarn</i> instalado na máquina, basta instalar com o comando <i>npm install --global yarn</i>.</p>

</div>

<div id = "executando">

## :computer: Executando ##

<p>

  Depois de correr tudo certo nas instalações, está na hora de clonar o repositório.

</p>

```bash
# Clone este projeto
$ git clone https://github.com/Iuri-Almeida/dsmovie.git
# Rode o back-end da aplicação na sua IDE (IntelliJ, Eclipse, ...)
# Acesse a pasta do projeto de frontend
$ cd dsmovie/frontend
# Instale as dependências
$ yarn install
# Inicie o projeto
$ yarn start
```

</div>

<div id = "referencias">

## :key: Referências ##

Alguns locais de onde me baseei para realizar o projeto:

* [Semana Spring React - Dev Superior][semana_spring_react]

:mag: &#xa0; Os ícones usados nesse README foram tirados desse [repositório][icones].

</div>

<!-- Links -->
[semana_spring_react]: https://devsuperior.com.br/evento-sds?episodio=1
[java]: https://www.java.com/pt-BR/
[intellij]: https://www.jetbrains.com/idea/
[git]: https://git-scm.com
[icones]: https://gist.github.com/rxaviers/7360908
[dev_superior]: https://devsuperior.com.br/
[reactjs]: https://pt-br.reactjs.org/
[nodejs]: https://nodejs.org/
[yarn]: https://yarnpkg.com/
[spring_boot]: https://spring.io/
[h2]: https://www.h2database.com/html/main.html
[postgresql]: https://www.postgresql.org/
[netlify]: https://www.netlify.com/
[heroku]: https://www.heroku.com/
[link_netlify]: https://semana-spring-react-dsmovie.netlify.app/
[link_heroku]: https://semana-spring-react-dsmovie.herokuapp.com/