let temp;
let h;

const table = document.querySelector('.table');
// let url="http://localhost:8088/services/RS/admin";
let url='http://localhost:8080/services_war/RS/admin';

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
  const addAdminForm = document.querySelector(".add-admin-form");
 addAdminForm.addEventListener('submit',(e)=>{
        e.preventDefault();
        console.log(nom.value)  
        console.log(prenom.value) 
        console.log(email.value) 
        console.log(pass.value) 
        fetch(url,{
          method:'POST',
          
          // mode: 'cors',  
          body: JSON.stringify({
            email: email.value,
            nom: nom.value,
            pass: pass.value,
            prenom: prenom.value
          }),

          headers:{
            'Accept':'application/json',
            'Content-Type':'application/json; charset=UTF-8',
            // "Access-Control-Allow-Origin": "*",
        }
        })
        // Converting to JSON
        .then(response => response.json())
        
        // Displaying results to console
        .then(json => console.log(json))
        .catch(console.error);
        // .then(res => res.json())

        // .then(data=>{
        //   const dataArr=[];
        //   dataArr.push(data);
        //  renderAdmins(dataArr);
        // })      
      },
    
);