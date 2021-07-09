import 'package:flutter/material.dart';
import 'package:heathcare/constants.dart';
class gender_card extends StatelessWidget {
  gender_card({@required this.icon,@required this.label});
  final IconData icon;
  final String label;

  @override
  Widget build(BuildContext context) {
    return Column(
      mainAxisAlignment: MainAxisAlignment.center,
      children: [
        Icon(
          icon,
          color: Colors.white,
          size:  80.0,
        ),
        SizedBox(
          height: 15.0,
        ),
        Text(label,style: labelTextStyle,)
      ],
    );
  }
}
