import 'dart:ui';
import 'package:heathcare/Components/calculator_brain.dart';
import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';
import 'package:heathcare/Components/reusable_card.dart';
import 'package:heathcare/Screens/home_screen.dart';
import 'package:heathcare/Screens/userinfo.dart';
import 'package:heathcare/constants.dart';
import 'package:font_awesome_flutter/font_awesome_flutter.dart';
import 'package:heathcare/Components/icon_maker.dart';
import 'home_screen.dart';

enum Gender{
  male,
  female,
}
class InputPage extends StatefulWidget {
  @override
  _InputPageState createState() => _InputPageState();
}

class _InputPageState extends State<InputPage> {
  // Color male_card_color = passive_color;
  // Color female_card_color = passive_color;
  int height=180;
  int age=20;
  int weight=60;
  Gender selected_gender;
  CalculatorBrain cal;
  @override
  Widget build(BuildContext context) {

    return Scaffold(

      // backgroundColor: Colors.purpleAccent,
      appBar: AppBar(
        backgroundColor: Colors.white,
        title: Text('Details',style: TextStyle(color: Colors.black,),textAlign: TextAlign.start,),
      ),
      body: SafeArea(
        child: Column(
          crossAxisAlignment: CrossAxisAlignment.stretch,
          children: [
            Expanded(child: Row(
              children: [
                Expanded(child: ReusableCard(onPress: () {
                  setState(() {
                    selected_gender = Gender.male;
                  });
                }

                  ,colour: selected_gender==Gender.male ? active_color : passive_color
                  ,
                  cardChild: gender_card(icon: FontAwesomeIcons.mars,label: 'MALE',),)),
                Expanded(child: ReusableCard(onPress:() {
                  setState(() {
                    selected_gender = Gender.female;
                  });
                },colour: selected_gender == Gender.female ? active_color : passive_color,
                  cardChild: gender_card(icon: FontAwesomeIcons.venus,label: 'FEMALE',),)),

              ],
            )),
            Expanded(child: ReusableCard(
              colour: Color(0xFF1D1E33),
              cardChild: Column(
                mainAxisAlignment: MainAxisAlignment.center,
                children: [
                  Text('HEIGHT',style: labelTextStyle),
                  Row(mainAxisAlignment: MainAxisAlignment.center,
                    crossAxisAlignment: CrossAxisAlignment.baseline,
                    textBaseline: TextBaseline.alphabetic,children: [
                      Text(height.toString(),style: TextStyle(
                        color: Colors.white,
                        fontSize: 50.0,
                        fontWeight: FontWeight.w900,
                      ),),
                      Text('cm',style: labelTextStyle,),
                    ],),
                  SliderTheme(
                    data: SliderTheme.of(context).copyWith(
                      thumbShape: RoundSliderThumbShape(enabledThumbRadius: 15.0),
                      thumbColor: Color(0xFFEB1555),
                      activeTrackColor: Colors.white,
                      inactiveTrackColor: Color(0xFF8D8E98),
                      overlayShape: RoundSliderOverlayShape(overlayRadius: 30.0),
                      overlayColor: Color(0x29EB1555),
                    ),
                    child: Slider(value: height.toDouble(),
                      min: 120.0,
                      max: 220.0,
                      onChanged: (double newValue){
                        setState(() {
                          height = newValue.toInt();
                        });
                      },),
                  ),
                ],
              ),)),
            Expanded(child: Row(
              children: [
                Expanded(child: ReusableCard(cardChild:Column(mainAxisAlignment: MainAxisAlignment.center,
                  children: [Text('WEIGHT',style: labelTextStyle,),
                    Row(mainAxisAlignment:MainAxisAlignment.center,crossAxisAlignment: CrossAxisAlignment.baseline,textBaseline: TextBaseline.alphabetic,children: [
                      Text(weight.toString(),style: TextStyle(color:Colors.white,fontSize: 50.0,fontWeight: FontWeight.w900),),
                      Text('kg',style: labelTextStyle,),
                    ],),


                    Row(mainAxisAlignment: MainAxisAlignment.center,
                        children:[FloatingActionButton(heroTag:"btn2",child: Icon(FontAwesomeIcons.minus),onPressed: (){
                          setState(() {
                            weight--;
                          });
                        },
                          backgroundColor: button_color,
                          foregroundColor: Colors.white,),FloatingActionButton(heroTag: 'btn1',child: Icon(FontAwesomeIcons.plus),onPressed: (){
                          setState(() {
                            weight++;
                          });
                        },
                          backgroundColor: button_color,
                          foregroundColor: Colors.white,)]
                    )
                  ],
                ),colour: Color(0xFF1D1E33),)),
                Expanded(child: ReusableCard(cardChild:Column(mainAxisAlignment: MainAxisAlignment.center,
                  children: [Text('Age',style: labelTextStyle,),
                    Text(age.toString(),style: TextStyle(color:Colors.white,fontSize: 50.0,fontWeight: FontWeight.w900),),

                    Row(mainAxisAlignment: MainAxisAlignment.center,
                        children:[FloatingActionButton(heroTag:"btn3",child: Icon(FontAwesomeIcons.minus),onPressed: (){
                          setState(() {
                            age--;
                          });
                        },
                          backgroundColor: button_color,
                          foregroundColor: Colors.white,),FloatingActionButton(heroTag:"btn4",child: Icon(FontAwesomeIcons.plus),onPressed: (){
                          setState(() {
                            age++;
                          });
                        },
                          backgroundColor: button_color,
                          foregroundColor: Colors.white,)]
                    )
                  ],
                ),colour: Color(0xFF1D1E33),)),
              ],
            ),
            ),
            GestureDetector(onTap: (){
              CalculatorBrain cal = CalculatorBrain(height: height,weight: weight);
              Navigator.push(context, MaterialPageRoute(builder: (context)=> HomeScreen(
                bmi: cal.calculateBMI(),
                bmi_text: cal.getResult(),
              )));

            },
                child: Container(
                  child:Center(
                    child: Text('SUBMIT',
                      style: TextStyle(color: Colors.white,fontSize: 30.0),),
                  ),
                  color: Color(0xFFEB1555),
                  margin: EdgeInsets.only(top: 10.0),
                  width: double.infinity,
                  height: 80.0,))
          ],

        ),
      ),
    );
  }
}


