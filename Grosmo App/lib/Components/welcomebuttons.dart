import 'package:flutter/material.dart';
import 'package:heathcare/constants.dart';
class Welcomebutton extends StatelessWidget {
  Welcomebutton({@required this.text,@required this.onPress});
  final String text;
  final Function onPress;

  @override
  Widget build(BuildContext context) {
    return GestureDetector(
      onTap: onPress,
      child: Container(
        height: 55.0,
        width: 250.0,
        child: Center(
          child: Text(
            text,
            style:TextStyle(
              fontWeight: FontWeight.bold,
              color: Colors.white,
              fontSize: 25.0,
            ) ,),
        ),

        margin: EdgeInsets.all(15.0),
        decoration: BoxDecoration(
          color: kPrimaryColour,
          borderRadius:BorderRadius.circular(20.0),

        ),
      ),
    );
  }
}
