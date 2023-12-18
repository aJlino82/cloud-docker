# Projeto Final - README
## Cloud e Docker com Aécio Pires

Este é um projeto simples usando Spring Boot e Docker.
Ele expõe um endpoint para cumprimentar uma pessoa pelo nome.

## Pré-requisitos

Certifique-se de ter o Docker instalado em sua máquina.

## Instalação

Para baixar execute o comando no terminal certifique-se de ter permissões de administrador:
````
docker pull seu-usuario/projeto-final:latest
````
Na mesma pasta onde você baixou a imagem execute o seguinte comando no terminal certifique-se de ter permissões de administrador:
```
docker run -p 8080:8080 projeto-final
````
Para acessar o aplicativo basta agora você digitar no seu navegador 
```
http://localhost:8080
```
Para interagir com a aplicação basta você adicionar ao final do endereço
o seu nome dessa forma "/seu-nome" como no exemplo:
```
http://localhost:8080/Adailton
````
