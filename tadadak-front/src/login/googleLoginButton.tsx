import React from "react";
import { Button } from "antd";

interface GoogleButtonProps {
  children: React.ReactNode;
  onClick?: ()=> void;
}

const GoogleLoginButton: React.FC<GoogleButtonProps> = (props) => {

  const googleLoginUrl = "http://localhost:8080/login/oauth2/code/google";
  const { children, onClick } = props; // props 객체
  return (
      <Button
      href={googleLoginUrl}
      type="primary"
      onClick = {props.onClick}>
          {children}
      </Button>
  );
};

export default GoogleLoginButton;