import 'package:flutter/material.dart';
import 'package:heathcare/Screens/input_screen.dart';
import 'package:heathcare/constants.dart';
import 'package:heathcare/Components/welcomebuttons.dart';
import 'input_screen.dart';
class LoginPage extends StatelessWidget {
  TextEditingController username_controller = TextEditingController();
  TextEditingController password_controller = TextEditingController();
  String username;
  String password;
  control (String username_value,String password__value){
    username = username_value;
    password = password__value;
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: Color(0xFFFFFBF2),
      body: SafeArea(
        child: SingleChildScrollView(
          padding: EdgeInsets.only(top: 80.0),
          reverse: true,
          child: Column(
            // crossAxisAlignment: CrossAxisAlignment.center,
            mainAxisAlignment: MainAxisAlignment.center,
            children: [
              Image.asset('assets/images/login_page.png'),
              SizedBox(
                height: 30.0,
              ),
              Center(
                child: Container(
                  width: 280.0,
                  child: TextField(
                    controller: username_controller,
                    obscureText: false,
                    decoration: InputDecoration(
                      enabledBorder: OutlineInputBorder(
                        borderRadius: BorderRadius.circular(20.0)
                      ),
                      focusedBorder: OutlineInputBorder(
                        borderRadius: BorderRadius.circular(20.0)
                      ),
                      hintText: 'Username',
                      prefixIcon: Icon(Icons.email)
                    ),
                  ),
                ),
              ),
              SizedBox(
                height: 10.0,
              ),
              Center(
                child: Container(
                  width: 280.0,
                  child: TextField(
                    controller: password_controller,
                    obscureText: true,
                    decoration: InputDecoration(
                        enabledBorder: OutlineInputBorder(
                            borderRadius: BorderRadius.circular(20.0)
                        ),
                        focusedBorder: OutlineInputBorder(
                            borderRadius: BorderRadius.circular(20.0)
                        ),
                        hintText: 'Password',
                        prefixIcon: Icon(Icons.lock),
                        suffixIcon: Icon(Icons.visibility)
                    ),
                  ),
                ),
              ),
              Welcomebutton(
                  text: 'LOGIN',
                  onPress: (){
                    control(username_controller.text,password_controller.text);
                    if (username=='Chirag' && password=='ca123456'){
                      Navigator.push(context, MaterialPageRoute(builder: (context)=>InputPage()));
                    }else{
                      print('wrong details');
                    }
                  })
            ],
          ),
        ),
      ),
    );
  }
}
