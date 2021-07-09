import 'package:flutter/material.dart';
import 'package:url_launcher/url_launcher.dart';
import 'package:heathcare/Components/reusable_card.dart';
import 'package:heathcare/constants.dart';
// class AssistanceScreen extends StatelessWidget {

//   @override
//   Widget build(BuildContext context) {
//     return Scaffold(
//       backgroundColor: kAssitanceCardColor,
      // appBar: AppBar(
      //   title: Text('Assistance'),
      // ),
      // body: SafeArea(
      //   child: Column(
      //     children: [
      //       // Size
      //       Expanded(
      //         child: Row(
      //           children: [
                  // Expanded(
                  //   child: ReusableCard(
                  //     colour: kAssitanceCardColor,
                  //     cardChild: Column(
                  //       children: [
                  //         Image.asset('assets/images/doctor.png'),
                  //
                  //         Text('Consult a doctor'),
                  //       ],
                  //     ),
                  //   ),
                  // ),
                  // Expanded(
                  //   child: ReusableCard(
                  //     colour: kAssitanceCardColor,
            //           cardChild: Column(
            //             children: [
            //               Image.asset('assets/images/medicinee.png'),
            //               Text('Book your Medicines'),
            //             ],
            //           ),
            //         ),
            //       ),
            //     ],
            //   ),
            // ),
            // // SizedBox(height: 50.0,width: double.infinity,),
            // Expanded(
            //   child: Row(
            //     children: [
            //       Expanded(
            //         child: ReusableCard(
            //           colour:kAssitanceCardColor,
            //           cardChild: Column(
            //             children: [
            //               Image.asset('assets/images/vaccine.png'),
            //               Text('Book your Vaccine'),
            //             ],
      //                 ),
      //               ),
      //             ),
      //             Expanded(
      //               child: ReusableCard(
      //                 colour: kAssitanceCardColor,
      //                 cardChild: Column(
      //                   children: [
      //                     Image.asset('assets/images/awareness.png'),
      //                     Text('Health Awareness'),
      //                   ],
      //                 ),
      //               ),
      //             ),
      //           ],
      //         ),
      //       ),
      //     ],
      //   ),
      // ),
    // );
//   }
// }
class AssistanceScreen extends StatefulWidget {
  @override
  _AssistanceScreenState createState() => _AssistanceScreenState();
}

class _AssistanceScreenState extends State<AssistanceScreen> {

  openURL(String url) async {
    if (await canLaunch(url)){
      await launch(url);
    }else{
      throw 'Could not open';
    }
  }
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: kAssitanceCardColor,
      appBar: AppBar(
        title: Text('Assistance'),
      ),
      body: SafeArea(
        child: Column(
          children: [
            // Size
            Expanded(
              child: Row(
                children: [
                  Expanded(
                    child: ReusableCard(
                      onPress: (){
                        openURL('https://www.apollo247.com');
                      },
                      colour: kAssitanceCardColor,
                      cardChild: Column(
                        children: [
                          Image.asset('assets/images/doctor.png'),
                          Text('Consult a doctor'),
                        ],
                      ),
                    ),
                  ),
                  Expanded(
                    child: ReusableCard(
                      onPress: (){
                        openURL('https://pharmeasy.in');
                      },
                      colour: kAssitanceCardColor,
                      cardChild: Column(
                        children: [
                          Image.asset('assets/images/medicinee.png'),
                          Text('Book your Medicines'),
                        ],
                      ),
                    ),
                  ),
                ],
              ),
            ),
            // SizedBox(height: 50.0,width: double.infinity,),
            Expanded(
              child: Row(
                children: [
                  Expanded(
                    child: ReusableCard(
                      onPress: () {
                        openURL('https://www.cowin.gov.in/');
                      },
                      colour:kAssitanceCardColor,
                      cardChild: Column(
                        children: [
                          Image.asset('assets/images/vaccine.png'),
                          Text('Book your Vaccine'),
                        ],
                      ),
                    ),
                  ),
                  Expanded(
                    child: ReusableCard(
                      onPress: (){
                        openURL('https://www.mohfw.gov.in/');
                      },
                      colour: kAssitanceCardColor,
                      cardChild: Column(
                        children: [
                          Image.asset('assets/images/awareness.png'),
                          Text('Health Awareness'),
                        ],
                      ),
                    ),
                  ),
                ],
              ),
            ),
          ],
        ),
      ),
    );
  }
}
