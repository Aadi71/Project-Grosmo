import 'package:flutter/material.dart';
class AboutScreen extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: Color(0xFFE7ABC3),
      appBar: AppBar(
        title: Text('About GROSMO'),
      ),
      body: SafeArea(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            Text(
                'Project Grosmo will boom the Health Care Industry.We are preparing a management system using Java(GUI & Database) and to extend its limitations we will also optimize it to an Android app to provide its every features t mobile users. Additionally, we have prepared a real-time chat service which will ease up the communication between user and service provider.',
                 style: TextStyle(
                   fontSize:20.0,
                   fontWeight: FontWeight.bold,
                 ),
              textAlign: TextAlign.center,
            )
          ],
        ),
      ),
    );
  }
}
