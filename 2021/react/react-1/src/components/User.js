import React, { Component } from 'react'

class User extends Component {
    render() {
        const{name,surname}=this.props;
        return (
            <div>
                <ul>
                    <li>firstName: {name}</li>
                    <li>secondName: {surname}</li>
                </ul>
            </div>
        )
    }
}
export default User;



