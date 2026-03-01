
let currentTheme =  getTheme();

changeTheme();

function changeTheme() {
    //set to the web
    document.querySelector('html').classList.add(currentTheme);

    // set listener tp change theme
    const changeThemeButton = document.querySelector("#theme_change_button");
    changeThemeButton.addEventListener("click", () => {
        //remove current theme
        document.querySelector('html').classList.remove(currentTheme);
        //get current theme
        if(currentTheme === "dark"){
            // change to light
            currentTheme = "light";
        } else {
            // change to dark
            currentTheme = "dark";
        }
        //set theme to local storage
        setTheme(currentTheme);

        //set to the web
        document.querySelector('html').classList.add(currentTheme);
        
    });
}
function setTheme(theme){
    localStorage.setItem("theme",theme);
}

function getTheme(){
    let theme = localStorage.getItem("theme");
    return theme ? theme : "light";
}