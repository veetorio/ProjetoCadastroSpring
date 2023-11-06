const form = document.querySelector('form')
const Gnome = document.querySelector('#nickname')
const Gemail = document.querySelector('#email')
const Gsenha = document.querySelector('#senha')




function conect(){
    fetch('http://localhost:8080/database/enviar', {
        headers: {
            'Accept': "application/json",
            'Content-Type': 'application/json'
        },
        method: 'POST',
        body: JSON.stringify({
            email: Gemail.value,
            nome: Gnome.value,
            senha: Gsenha.value
        })
    }
    ).then(Promise => window.alert("Cadastro feito com sucesso")).catch(window.alert(" seus dados não foram enviado por conta de algum erro "))
}
form.addEventListener('submit', event => {
    event.preventDefault();
    conect();
}
);


function limpar(){
    Gnome.value = '';
    Gemail.value = '';
    Gsenha.value = '';

}
