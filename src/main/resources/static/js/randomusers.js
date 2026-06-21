function Random_user(){
    //.    
    fetch ("https://randomuser.me/api")
    .then(
        
        function (k){
           return k.json();
    }

).then(function(json_data){
    var new_user=json_data.results[0];
    var fullName=user.name.title+" "+user.name.first+" "+user.name.last;
        document.getElementById("usr-name").innerHTML=users[id].fullName
    document.getElementById("usr-gen").innerHTML=new_useruser.gen
    document.getElementById("usr-img").src=new_user.picture.large

})
.catch(function(error){
    console.log(error+"error")
})

}