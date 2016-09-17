/**
 * Created by Dell on 2016/9/13.
 */


/*
 function titleButtonChange(goalId){
 var goal=document.getElementById(goalId);
 //goal.animate({opacity:1},"slow");
 goal.style.background='rgba(102,102,102,1)';
 goal.style.cursor='pointer';
 //goal.style.backgroundColor='#000000';
 }

 function titleButtonRecover(goalId){
 var goal=document.getElementById(goalId);
 goal.style.background='rgba(102,102,102,0)';
 goal.style.cursor='default';
 }*/

$('.titleButton').on('mouseenter', function () {
    console.log("sasdad");
    $(this).animate({
            background: 'rgba(102,102,102,1)'
        }
        , 500);
}).on('mouseout', function () {
    $(this).animate({
        background: 'rgba(102,102,102,0)'
    }, 500)
});