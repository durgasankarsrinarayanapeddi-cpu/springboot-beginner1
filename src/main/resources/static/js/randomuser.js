function Random_user(){
    // Fetch from external randomuser.me API
    fetch("https://randomuser.me/api")
    .then(function (response){
        return response.json();
    })
    .then(function(json_data){
        var new_user = json_data.results[0];
        var fullName = new_user.name.title + " " + new_user.name.first + " " + new_user.name.last;
        
        // Debug: Log the user data
        console.log("New user:", new_user);
        console.log("Gender:", new_user.gender);
        
        document.getElementById("usr-name").innerHTML = fullName;
        document.getElementById("usr-gen").innerHTML = new_user.gender;
        document.getElementById("usr-img").src = new_user.picture.large;
        
        // Change shadow color based on gender
        var card = document.getElementById("card");
        console.log("Card element:", card);
        console.log("Current classes:", card.className);
        
        card.classList.remove("pink-shadow", "blue-shadow");
        console.log("After remove:", card.className);
        
        card.classList.add(new_user.gender === "male" ? "blue-shadow" : "pink-shadow");
        console.log("After add:", card.className);
        console.log("Shadow should be:", new_user.gender === "male" ? "blue" : "pink");
    })
    .catch(function(error){
        console.log("Error fetching random user: " + error);
    });
}
