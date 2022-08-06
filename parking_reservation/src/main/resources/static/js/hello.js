var a = window.document.getElementById('menuregistro');
var b = window.document.getElementById('mensagem');
b.style.position='absolute';
b.style.left='-200px';
b.style.right='-200px';
a.addEventListener('mouseenter', entrou);
a.addEventListener('mouseout', saiu);

function entrou(){
b.style.left='0px';
b.style.right='0px';
}
function saiu(){
b.style.left='-200px';
b.style.right='-200px';
}
function cadastrar(){
//	criando o objeto e recebendo os valores pelo input
	var EstacionamentoDTO = {};
		EstacionamentoDTO.modelodoVeiculo = $("#modelo").val();
		EstacionamentoDTO.placadoVeiculo = $("#placa").val();
		EstacionamentoDTO.cordoVeiculo = $("#cor").val();
		EstacionamentoDTO.proprietario = $("#proprietario").val();
//		reuisição ajax
		$.ajax({
			 
			url:"/Estacionamento/Save",
			type: 'POST',
			datatype: 'json',
			contentType: 'application/json',
			data: JSON.stringify(EstacionamentoDTO)
		}).done(function(e){
			alert("funcionou")
		}).fail(function(){
			alert("falhou");
		});
//done = deu certo, fail = falhou	
}