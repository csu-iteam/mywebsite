/**
 * Created by Dell on 2016/9/13.
 */

function titleButtonChange(goalId){
    var goal=document.getElementById(goalId);
    goal.style.background='rgba(102,102,102,1)';
    goal.style.cursor='pointer';
    //goal.style.backgroundColor='#000000';
}
function titleButtonRecover(goalId){
    var goal=document.getElementById(goalId);
    goal.style.background='rgba(102,102,102,0)';
    goal.style.cursor='default';
}