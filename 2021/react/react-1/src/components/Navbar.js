import React from "react";

// function Navbar() {
//     return (
//         <div>Function component</div>
//     )
// }
// const Navbar=()=> {
//     return (
//         <div>Function with arrow component</div>
//     )
// }
const Navbar = (props) => {
    return (
        <div>
            {props.title}
        </div>
        
    )
}
export default Navbar;

