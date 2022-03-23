import React from "react";
import { Button } from "antd";

interface GoogleButtonProps {
  children: React.ReactNode;
  onClick?: ()=> void;
}

const GoogleLoginButton: React.FC<GoogleButtonProps> = (props) => {

  const { children, onClick } = props; // props 객체
  return (
      <Button 
      type="primary"
      onClick = {props.onClick}>
          {children}
      </Button>
  );
};

export default GoogleLoginButton;