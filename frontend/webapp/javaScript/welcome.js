/**
 * Created by Dell on 2016/9/12.
 */

function DetailAppear(goalId){
    var goal=document.getElementById(goalId);
    goal.style.bottom="-120px";
    console.log("DetailAppear");
}
function DetailHide(goalId){
    var goal=document.getElementById(goalId);
    goal.style.bottom="-250px";
    console.log("DetailHide");
}