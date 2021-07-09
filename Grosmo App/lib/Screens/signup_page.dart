import 'package:flutter/material.dart';
import 'package:heathcare/Components/welcomebuttons.dart';
import 'package:heathcare/Screens/home_screen.dart';
import 'package:heathcare/Screens/input_screen.dart';
 class SignupPage extends StatelessWidget {
   @override
   Widget build(BuildContext context) {
     return Scaffold(
       backgroundColor: Color(0xFFFFFBF2),
       body: SafeArea(
         child: SingleChildScrollView(
           padding: EdgeInsets.only(top: 80.0),
           reverse: true,
           child: Center(
             child: Column(
               // crossAxisAlignment: CrossAxisAlignment.center,
               mainAxisAlignment: MainAxisAlignment.center,
               children: [
                 Image.asset('assets/images/signup.png'),
                 SizedBox(
                   height: 30.0,
                 ),
                 Center(
                   child: Container(
                     width: 280.0,
                     child: TextField(
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
                     text: 'SignUp',
                     onPress: (){
                       Navigator.push(context, MaterialPageRoute(builder: (context)=>InputPage()));
                     })
               ],
             ),
           ),
         ),
       ),
     );
   }
 }
