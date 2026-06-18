var users = [
    {
        "id": 0,
        "img":"/images/john.png",
        "name": "John Doe",
        "gen": "Male",
        "shadow":"blue-shadow"

    },
    {
        "id": 1,
        "img":"/images/jane.png",
        "name": "Jane Doe",
        "gen": "Female",
        "shadow":"pink-shadow"

    }
];
var id=0;

function toggle() {
    id = (id + 1) % users.length;
    document.getElementById("usr-name").innerHTML=users[id].name
    document.getElementById("usr-gen").innerHTML=users[id].gen
    document.getElementById("usr-img").src=users[id].img
    let card=document.getElementById("card");

    // card.className=users[id].shadow;
    card.classList.remove("pink-shadow","blue-shadow");
    card.classList.add(users[id].shadow);

   
            
        }
    
    

