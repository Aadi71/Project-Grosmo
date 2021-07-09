import 'package:flutter/material.dart';
import 'Screens/welcome_screen.dart';
import 'constants.dart';
void main() => runApp(MyApp());
class MyApp extends StatefulWidget {
  @override
  _MyAppState createState() => _MyAppState();
}

class _MyAppState extends State<MyApp> {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'GROSMO',
      theme: ThemeData(
        primaryColor: kPrimaryColour
      ),
      home: WelcomeScreen(),
    );
  }
}
