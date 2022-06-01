let temp;
let h;
const addAdminForm = document.querySelector('.add-admin-form');
const table = document.querySelector('.table');
let url="http://localhost:8088/services/RS/admin";
let nom=document.getElementById("nom");
let prenom=document.getElementById("prenom");
let email= document.getElementById("email");
let pass=document.getElementById("password");

const renderAdmins =(admins)=>{
  let  html='';  
    admins.forEach(admin=>{
  h=admin.id;
  html+='<tr>';
  html+='<td>'+admin.id+'</td>';
  html+='<td>'+admin.nom+'</td>';
  html+='<td>'+admin.prenom+'</td>';
  html+='<td>'+admin.email+'</td>';
  html+='<td> <a href="" a class="btn btn-sm btn-primary" onclick="updateData('+h+')" >Update</a><a class="btn btn-sm btn-primary"  id="delete" >Delete</a></td>';
  html+='</tr>';

})
      table.innerHTML=html;
 }
 
    
    fetch(url) 
      .then(res => res.json())
      .then(data=>renderAdmins(data))

 addAdminForm.addEventListener('submit',(e)=>{
        e.preventDefault();
        console.log(nom.value)       
        fetch(url,{
        // mode:'cors',
        
          method:'POST',
          headers:{
              Accept:'application/json, text/plain',
              'Content-Type':'application/json;charset=UTF-8',
              "Access-Control-Allow-Origin": "*",
              'Content-Type': 'application/json',
              
          }, 
          mode: 'no-cors',  
          body:JSON.stringify({
            nom: nom.value,
            prenom:prenom.value,
            email:email.value,
            pass:pass.value
          })
        })
        .then(res => res.json())
        // .then(data=>{
        //   const dataArr=[];
        //   dataArr.push(data);
        //  // renderAdmins(dataArr);
        // })      
      },
    
)