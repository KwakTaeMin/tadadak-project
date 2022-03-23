import React from "react";
import GoogleLoginButton from "./googleLoginButton";

function Login() {
    const loginGoogle = () => {
        alert("google login");
    }
    return (
      <div>
          <GoogleLoginButton onClick={loginGoogle} children={"Google로 로그인"} />
      </div>
    );
}

export default Login;
