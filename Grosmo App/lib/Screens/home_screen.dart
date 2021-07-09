import 'package:flutter/material.dart';
import 'package:flutter/services.dart';
import 'dart:ui';
import 'package:font_awesome_flutter/font_awesome_flutter.dart';
import 'package:heathcare/Components/reusable_card.dart';
import 'package:font_awesome_flutter/font_awesome_flutter.dart';
import 'package:heathcare/Screens/about.dart';
import 'package:heathcare/Screens/assistance.dart';
import 'package:heathcare/Screens/input_screen.dart';
import 'package:heathcare/constants.dart';
import 'dart:math';

import 'package:heathcare/constants.dart';

class HomeScreen extends StatefulWidget {
  HomeScreen({this.bmi,this.bmi_text});
  final String bmi;
  final String bmi_text;

  @override
  _HomeScreenState createState() {
    return _HomeScreenState(
      bmi: this.bmi,
      bmi_text : this.bmi_text);
  }
}

class _HomeScreenState extends State<HomeScreen> {
  _HomeScreenState({this.bmi,this.bmi_text});
  final String bmi;
  final String bmi_text;
  int current_index=0;
  String interpret;
  Random quo = Random();
  @override
  Widget build(BuildContext context) {
    if (bmi_text == 'Overweight') {
      interpret ='You have a higher than normal body weight. Try to exercise more.';
    } else if (bmi_text== 'Normal') {
      interpret =  'You have a normal body weight. Good job!';
    } else {
      interpret = 'You have a lower than normal body weight. You can eat a bit more.';
    }
    return Scaffold(
      backgroundColor: Colors.white,
      bottomNavigationBar: BottomNavigationBar(
        fixedColor: Colors.lightBlueAccent,
        // backgroundColor: Colors.blue,
        currentIndex: current_index,
        items: [
          BottomNavigationBarItem(
            backgroundColor: Colors.black,
            icon: Icon(FontAwesomeIcons.home),
            title: Text('Home'),
          ),
          BottomNavigationBarItem(
            backgroundColor: Colors.black,
            icon: Icon(FontAwesomeIcons.headphones),
            title: Text('Assistance'),
          ),
          BottomNavigationBarItem(
            backgroundColor: Colors.black,
            icon: Icon(FontAwesomeIcons.info),
            title: Text('About'),
          )
        ],
        onTap: (index){
          setState(() {
            current_index = index;
          });
          if (current_index==0){
            print('user');
          } else if (current_index==1){
            Navigator.push(context, MaterialPageRoute(builder: (context)=>AssistanceScreen()));
          } else if (current_index==2){
            Navigator.push(context, MaterialPageRoute(builder: (context)=>AboutScreen()));

          }
        },
      ),
      appBar: AppBar(
        title: Text('WELCOME USER'),
      ),
      body: SafeArea(
        child: Column(
          crossAxisAlignment: CrossAxisAlignment.stretch,
          children: [
            Expanded(
              child: ReusableCard(

                  cardChild: Column(
                    children: [
                      SizedBox(height: 15.0,width: double.infinity,),
                      Row(
                        children: [
                          SizedBox(width: 20.0,),
                          Text('BMI:  ',style: TextStyle(fontSize: 25.0,fontWeight: FontWeight.bold),),
                          Text(bmi,style: TextStyle(fontSize: 20.0,fontWeight: FontWeight.bold),)
                        ],
                      ),
                      SizedBox(height: 15.0,width: double.infinity,),
                      Row(
                        children: [
                          SizedBox(width: 40.0,),
                          Text(bmi_text,style: TextStyle(fontWeight: FontWeight.bold,fontSize: 35.0),),
                        ],
                      ),
                      SizedBox(height: 15.0,width: double.infinity,),
                      Center(child: Text(interpret,style:TextStyle(fontSize: 20.0,fontWeight: FontWeight.bold),textAlign: TextAlign.center,)),
                    ],
                  ),
                  colour: Color(0xFFFEDDE2),
              ),
            ),
            Expanded(
                flex:2,
                child: ReusableCard(
                  cardChild: Center(
                      child: Text(
                          quotes[quo.nextInt(6)],
                          textAlign: TextAlign.center,
                          style:TextStyle(
                            fontSize: 20.0,
                          ) ,
                      ),
                  ),
                  colour: Color(0xFFFEDDE2),
            ),
            ),
          ],
        ),
      ),
    );;
  }
}



