# Projeto Spring com um endpoint que consome um objeto recebido

Esse projeto tem como objetivo apresentar um endpoint que consome um objeto recebido utilizando o framework Spring. 

Ao fazer uma requisição `POST` na rota `/api/user` na porta `8080` do `localhost` com JSON:

```
{
	"modelo": "Fiat Argo 1.3",
	"fabricante": "Fiat",
	"dataFabricacao": "10/02/2006",
	"valor": 10.000,
	"anoModelo": 2023,
}
```

, será retornado o status `201`.