let Global_nome = document.getElementById("nickname")
let Global_email = document.getElementById("email")
let Global_senha = document.getElementById("nickname")

const entidade = {
        nome: Global_nome.value,
        email: Global_email.value,
        senha: Global_senha.value
    }

function conection(){
    const url = "http//localhost:8080/post";
    fetch(url,{
        headers :{
            'Accept':'Application/json',
            'content-type': 'application/json'
        },
        method : 'POST',
        body : JSON.stringify(entidade)
       
    }).then((resp) => {console.log(resp)})
}



 fetch("http//localhost:8080/cad").then(response => console.log(response))



function coletar() {
    conection(); 
}