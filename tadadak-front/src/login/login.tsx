import React from "react";
import GoogleLoginButton from "./googleLoginButton";

function Login() {
    return (
      <div>
          <GoogleLoginButton children={"Google로 로그인"} />
      </div>
    );
}

export default Login;
