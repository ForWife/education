var SliderA = document.getElementsByClassName("map_up")[0];
var SliderB = document.getElementsByClassName("map_down")[0];

var SliderC = document.getElementsByClassName("map_bottom")[0];
var SliderD = document.getElementsByClassName("class_detail")[0];


SliderA.onclick = function () {
    SliderA.style.display = "none";
    SliderC.style.display = "none";
    SliderD.style.display = "block";
}

SliderB.onclick = function () {
    SliderA.style.display = "block";
    SliderC.style.display = "flex";
    SliderD.style.display = "none";
}