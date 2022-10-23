package com.example.practicecodescourse;

import java.util.Scanner;

public class resistance_max_4 {
    public static void main(String[] args) {
        System.out.println("----------------------------------------------------------------------");
        System.out.println("                      \uD83D\uDE4F WELCOME  \uD83D\uDE4F");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("              EQUIVALENT RESISTOR CALCULATOR "); // main heading
        System.out.println("----------------------------------------------------------------------");

// --------------------------------------------------------------------------------------------------------------------------------------------------------------


        Scanner permit = new Scanner(System.in);
        System.out.println("                    * INSTRUCTIONS         ");
        System.out.println("• IT IS PROGRAMMED TO CALCULATE ONLY MAXIMUM 6 RESISTOR");
        System.out.println("• TOTAL NUMBER OF RESISTANCE SHOULD NOT EXCEED 6 ");
        System.out.println("----------------------------------------------------------------------");


// --------------------------------------------------------------------------------------------------------------------------------------------------------------


        System.out.print("TOTAL NUMBER OF RESISTANCE  = ");
        int CT = permit.nextInt();
        System.out.println("----------------------------------------------------------------------");


// --------------------------------------------------------------------------------------------------------------------------------------------------------------


        if (CT == 1) {
            System.out.print("ENTER VALUE OF RESISTOR = ");
            float c11 = permit.nextFloat();
            System.out.println("----------------------------------------------------------------------");
            System.out.println("• EQUIVALENT RESISTANCE = " + c11);
        }


// --------------------------------------------------------------------------------------------------------------------------------------------------------------


        if (CT == 2) {
            System.out.print("ENTER VALUE OF 1ST RESISTOR = ");
            float c21 = permit.nextFloat();
            System.out.print("ENTER VALUE OF 2ND RESISTOR = ");
            float c22 = permit.nextFloat();
            System.out.print("----------------------------------------------------------------------");
            System.out.println(

            );
            System.out.print("NUMBER OF PACKET OF SERIES = ");
            int cs2 = permit.nextInt();// combination in parallel = sp2
            System.out.print("NUMBER OF PACKET OF PARALLEL = ");
            int cp2 = permit.nextInt();// combination in series = cs2
            System.out.println("----------------------------------------------------------------------");

// --------------------------------------------------------------------------------------------------------------------------------------------------------------

            if (cs2 == 2 && cp2 == 0) {
                float sum = c21 + c22;

                System.out.println("•EQUIVALENT RESISTANCE = " + sum);
            }

            if (cp2 == 1 && cs2 == 0) {
                float sump2 = (c21 * c22) / (c21 + c22);
                System.out.println("• EQUIVALENT RESISTANCE = " + sump2);
            }
        }
// --------------------------------------------------------------------------------------------------------------------------------------------------------------


//-------------------------------------------NEW START FOR MAXIMUM 3---------------------------------------------------------------------------------------------------------------
        if (CT == 3) {
            System.out.print("NUMBER OF BRANCHES OF MAIN WIRE = ");
            int no_of_branches = permit.nextInt();
            System.out.println("----------------------------------------------------------------------");


// --------------------------------------------------------------------------------------------------------------------------------------------------------------


            if (no_of_branches == 1) {
                System.out.println("• LET THE MAIN BRANCH :-");
                System.out.println("• BRANCH-A");
                System.out.println("----------------------------------------------------------------------");

// --------------------------------------------------------------------------------------------------------------------------------------------------------------
                System.out.print("TOTAL NUMBER OF PARALLEL PACKET IN BRANCH-A = ");
                int no_of_parallel_packet_in_A = permit.nextInt();
                System.out.print("TOTAL NUMBER OF SERIES PACKET IN BRANCH-A = ");
                int no_of_series_packet_in_A = permit.nextInt();
                System.out.println("----------------------------------------------------------------------");


// --------------------------------------------------------------------------------------------------------------------------------------------------------------


                if (no_of_series_packet_in_A == 1 && no_of_parallel_packet_in_A == 1) {


                    System.out.print("VALUE OF 1ST RESISTOR IN PARALLEL IN BRANCH-A = ");
                    float v_of_1st_in_parallel_in_branch_A = permit.nextFloat();
                    System.out.print("VALUE OF 2ND RESISTOR IN PARALLEL IN BRANCH-A = ");
                    float v_of_2st_in_parallel_in_branch_A = permit.nextFloat();


                    System.out.print("VALUE OF 1 ST RESISTOR IN SERIES IN BRANCH-A = ");
                    float v_of_1st_in_series_in_branch_A = permit.nextFloat();

                    float parallelkacaculation = (v_of_1st_in_parallel_in_branch_A * v_of_2st_in_parallel_in_branch_A) / (v_of_1st_in_parallel_in_branch_A + v_of_2st_in_parallel_in_branch_A);

                    float result = parallelkacaculation + v_of_1st_in_series_in_branch_A;
                    System.out.print("• EQUIVALENT RESISTANCE = ");
                    System.out.println(result);
                    System.out.println("----------------------------------------------------------------------");
                }


// --------------------------------------------------------------------------------------------------------------------------------------------------------------


                if (no_of_series_packet_in_A == 3 && no_of_parallel_packet_in_A == 0) {
                    System.out.print("VALUE OF 1ST RESISTOR IN SERIES = ");
                    float value_of_1st_resistor_in_series_only = permit.nextFloat();
                    System.out.print("VALUE OF 2ST RESISTOR IN SERIES = ");
                    float value_of_2st_resistor_in_series_only = permit.nextFloat();
                    System.out.print("VALUE OF 3ST RESISTOR IN SERIES = ");
                    float value_of_3st_resistor_in_series_only = permit.nextFloat();

                    float result2 = value_of_1st_resistor_in_series_only + value_of_2st_resistor_in_series_only + value_of_3st_resistor_in_series_only;
                    System.out.println("----------------------------------------------------------------------");

                    System.out.print("• EQUIVALENT RESISTANCE = ");
                    System.out.println(result2);
                }
            }


// --------------------------------------------------------------------------------------------------------------------------------------------------------------


// ---------------------------------------------------------------------THE END-------------------------------------------------------------------------------------


// ---------------------------------------------------------------------THE END-------------------------------------------------------------------------------------
// BRANCH - 2, 3

            if (no_of_branches == 3) {
                System.out.println("• LET THE THREE BRANCHS OF WIRE BE :-");
                System.out.println(" • BRANCH-A");
                System.out.println(" • BRANCH-B");
                System.out.println(" • BRANCH-C");
                System.out.println("----------------------------------------------------------------------");


// --------------------------------------------------------------------------------------------------------------------------------------------------------------


                System.out.print("VALUE OF RESISTOR IN BRANCH-A = ");
                float value_of_resistor_in_branch_A_3 = permit.nextFloat();
                System.out.print("VALUE OF RESISTOR IN BRANCH-B = ");
                float value_of_resistor_in_branch_B_3 = permit.nextFloat();
                System.out.print("VALUE OF RESISTOR IN BRANCH-C = ");
                float value_of_resistor_in_branch_c_3 = permit.nextFloat();
                System.out.println("----------------------------------------------------------------------");

// --------------------------------------------------------------------------------------------------------------------------------------------------------------


                float sum_of_all_3_resistor_when_no_of_branch_3 = (value_of_resistor_in_branch_A_3 * value_of_resistor_in_branch_c_3 * value_of_resistor_in_branch_B_3) / (value_of_resistor_in_branch_B_3 * value_of_resistor_in_branch_c_3 + value_of_resistor_in_branch_A_3 * value_of_resistor_in_branch_c_3 + value_of_resistor_in_branch_A_3 * value_of_resistor_in_branch_B_3);
                float result3 = sum_of_all_3_resistor_when_no_of_branch_3;
                System.out.print("• EQUIVALENT RESISTOR = ");
                System.out.println(result3);
                System.out.println("----------------------------------------------------------------------");
            }
            if (no_of_branches == 2) {
                System.out.println("• LET THE TWO BRANCHS OF WIRE BE :-");
                System.out.println(" • BRANCH-A");
                System.out.println(" • BRANCH-B");

// --------------------------------------------------------------------------------------------------------------------------------------------------------------

                System.out.println("----------------------------------------------------------------------");
                System.out.println("                              BRANCH-A");
                System.out.println("----------------------------------------------------------------------");
                System.out.print("NUMBER OF PARALLEL PACKET IN BRANCH-A = ");
                int no_of_parallel_packet_in_branch_A_2 = permit.nextInt();
                System.out.print("NUMBER OF SERIES PACKET IN BRANCH-A = ");
                int no_of_series_packet_in_branch_A_2 = permit.nextInt();
                System.out.println("----------------------------------------------------------------------");
                System.out.println("                              BRANCH-B");
                System.out.println("----------------------------------------------------------------------");
                System.out.print("NUMBER OF PARALLEL PACKET IN BRANCH-B = ");
                int no_of_parallel_packet_in_branch_B_2 = permit.nextInt();
                System.out.print("NUMBER OF SERIES PACKET IN BRANCH-B = ");
                int no_of_series_packet_in_branch_B_2 = permit.nextInt();


                // --------------------------------------------------------------------------------------------------------------------------------------------------------------


                if (no_of_series_packet_in_branch_A_2 == 1 && no_of_series_packet_in_branch_B_2 == 2 && no_of_parallel_packet_in_branch_A_2 == 0 && no_of_parallel_packet_in_branch_B_2 == 0) {
                    System.out.println("----------------------------------------------------------------------");
                    System.out.print("ENTER VALUE OF RESISTOR IN BRANCH-A = ");
                    float only_resistor_in_branch_A_2ND_ka_C_1 = permit.nextFloat();
                    System.out.print("ENTER VALUE OF 1ST  RESISTOR IN BRANCH-B = ");
                    float resistor_in_branch_B_paralleL_ka_1st_2ND_ka_C_1 = permit.nextFloat();
                    System.out.print("ENTER VALUE OF 2ND RESISTOR IN BRANCH -B = ");
                    float resistor_in_branch_B_paralleL_ka_2st_2ND_ka_C_1 = permit.nextFloat();


// --------------------------------------------------------------------------------------------------------------------------------------------------------------


                    float sum_branch_2_case_1 = resistor_in_branch_B_paralleL_ka_1st_2ND_ka_C_1 + resistor_in_branch_B_paralleL_ka_2st_2ND_ka_C_1;

                    float result3 = (sum_branch_2_case_1 * only_resistor_in_branch_A_2ND_ka_C_1) / (sum_branch_2_case_1 + only_resistor_in_branch_A_2ND_ka_C_1);
                    System.out.println("----------------------------------------------------------------------");
                    System.out.print("• EQUIVALENT RESISTANCE = ");
                    System.out.println(result3);


                }
            }
        }


// -----------------------------------------------------------------THE END FOR MAX 3 RESISTOR---------------------------------------------------------------------------------------------


// -----------------------------------------------------------------START FOR MAX -4------------------------------------------------------------------------------------------------------


        if (CT == 4) {

            System.out.print("NUMBER OF BRANCHES OF MAIN WIRE = ");
            int no_of_branchesofmax_4 = permit.nextInt();
            System.out.println("----------------------------------------------------------------------");


// --------------------------------------------------------------------------------------------------------------------------------------------------------------


            if (no_of_branchesofmax_4 == 1) {
                System.out.println("• LET THE MAIN BRANCH :-");
                System.out.println("• BRANCH-A");
                System.out.println("----------------------------------------------------------------------");
                System.out.print("TOTAL NUMBER OF SERIES PACKET = ");
                float resistor_4_branch_1_series_packet = permit.nextFloat();
                System.out.print("TOTAL NUMBER OF PARALLEL PACKET = ");
                float resistor_4_branch_1_parallel_packet = permit.nextFloat();

                System.out.println("----------------------------------------------------------------------");


// --------------------------------------------------------------------------------------------------------------------------------------------------------------


// 1 he branch hai but total resistor 4 hai

                if (resistor_4_branch_1_series_packet == 4 && resistor_4_branch_1_parallel_packet == 0) { // ttttt
                    System.out.print("ENTER VALUE OF 1ST RESISTOR = ");
                    float first_resistor_in_all_series = permit.nextFloat();
                    System.out.print("ENTER VALUE OF 2ST RESISTOR = ");
                    float second_resistor_in_all_series = permit.nextFloat();
                    System.out.print("ENTER VALUE OF 3ST RESISTOR = ");
                    float third_resistor_in_all_series = permit.nextFloat();
                    System.out.print("ENTER VALUE OF 4ST RESISTOR = ");
                    float fourth_resistor_in_all_series = permit.nextFloat();


                    float result4_B_1 = first_resistor_in_all_series + second_resistor_in_all_series + third_resistor_in_all_series + fourth_resistor_in_all_series;
                    System.out.println("----------------------------------------------------------------------");
                    System.out.print("• EQUIVALENT RESISTANCE = ");
                    System.out.println(result4_B_1);
                }


                // --------------------------------------------------------------------------------------------------------------------------------------------------------------


                if (resistor_4_branch_1_series_packet == 0 && resistor_4_branch_1_parallel_packet == 2) {
                    System.out.print("ENTER VALUE OF 1ST RESISTOR IN PARALLEL = ");
                    float first_resistor_in_parallel_only = permit.nextFloat();
                    System.out.print("ENTER VALUE OF 2ND RESISTOR IN PARALLEL = ");
                    float second_resistor_in_parallel_only = permit.nextFloat();
                    System.out.print("ENTER VALUE OF 3RD RESISTOR IN PARALLEL = ");
                    float third_resistor_in_parallel_only = permit.nextFloat();
                    System.out.print("ENTER VALUE OF 4TH RESISTOR IN PARALLEL = ");
                    float fourth_resistor_in_parallel_only = permit.nextFloat();

                    float _1st_packet_calculator = (first_resistor_in_parallel_only * second_resistor_in_parallel_only) / (first_resistor_in_parallel_only + second_resistor_in_parallel_only);
                    float _2st_packet_calculator = (third_resistor_in_parallel_only * fourth_resistor_in_parallel_only) / (third_resistor_in_parallel_only + fourth_resistor_in_parallel_only);
                    float result4 = _1st_packet_calculator + _2st_packet_calculator;
                    System.out.println("----------------------------------------------------------------------");
                    System.out.print("• EQUIVALENT RESISTANCE = ");
                    System.out.println(result4);
                }


// --------------------------------------------------------------------------------------------------------------------------------------------------------------
                if (resistor_4_branch_1_series_packet == 2 && resistor_4_branch_1_parallel_packet == 1) {

                    System.out.print("ENTER VALUE OF 1ST RESISTOR IN SERIES = ");
                    float first_resistor_in_series = permit.nextFloat();
                    System.out.print("ENTER VALUE OF 2ND RESISTOR IN SERIES = ");
                    float second_resistor_in_series = permit.nextFloat();
                    System.out.println("----------------------------------------------------------------------");
                    System.out.print("ENTER VALUE OF 1ST RESISTOR IN PARALLEL = ");
                    float first_resistor_in_parallel = permit.nextFloat();
                    System.out.print("ENTER VALUE OF 2ST RESISTOR IN PARALLEL = ");
                    float second_resistor_in_parallel = permit.nextFloat();


                    float parallelpacketcalculaor = (first_resistor_in_parallel * second_resistor_in_parallel) / (first_resistor_in_parallel + second_resistor_in_parallel);
                    float result5 = parallelpacketcalculaor + first_resistor_in_series + second_resistor_in_series;
                    // float series_packet_calculator = first_resistor_in_series + second_resistor_in_series;
                    //float parallel_packet_calculator = (first_resistor_in_parallel * second_resistor_in_parallel) / (first_resistor_in_parallel + first_resistor_in_parallel);
                    //float result5 = series_packet_calculator + parallel_packet_calculator;
                    System.out.println("----------------------------------------------------------------------");
                    System.out.print("• EQUIVALENT RESISTANCE = ");
                    System.out.println(result5);
                }


// --------------------------------------------------------------------------------------------------------------------------------------------------------------


                if (resistor_4_branch_1_series_packet == 1 && resistor_4_branch_1_parallel_packet == 1) {  // ye bohat important hai  ----//-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/

                    System.out.print("ENTER VALUE OF 1ST RESISTOR IN SERIES = ");
                    float first_resistor_in_series_BRANCH_1 = permit.nextFloat();
                    System.out.print("ENTER VALUE OF 1ST RESISTOR IN PARALLEL = ");
                    float first_resistor_in_parallel_BRANCH_1 = permit.nextFloat();
                    System.out.print("ENTER VALUE OF 2ND RESISTOR WHICH IS IN SERIES WITH 1ST RESISTOR = ");
                    float yekuchalaghai = permit.nextFloat();
                    System.out.print("ENTER VALUE OF 2ND RESISTOR IN PARALLEL = ");
                    float second_resistor_in_parallel_2_BRANCH_1 = permit.nextFloat();

                    float parallelmaijosseriesthawocalculator = first_resistor_in_parallel_BRANCH_1 + yekuchalaghai;

                    float parallelpacketcalculator = (parallelmaijosseriesthawocalculator * second_resistor_in_parallel_2_BRANCH_1) / (parallelmaijosseriesthawocalculator + second_resistor_in_parallel_2_BRANCH_1);
                    float result6 = parallelmaijosseriesthawocalculator + first_resistor_in_series_BRANCH_1;

                    System.out.println("----------------------------------------------------------------------");

                    System.out.print("• EQUIVALENT RESISTANCE = ");
                    System.out.println(result6);
                }


            }


// --------------------------------------------------------------------------------------------------------------------------------------------------------------


            if (no_of_branchesofmax_4 == 4) {
                System.out.print("ENTER VALUE OF 1ST RESISTOR = ");
                float _1stresistor_4 = permit.nextFloat();
                System.out.print("ENTER VALUE OF 2ND RESISTOR = ");
                float _2ndresistor_4 = permit.nextFloat();
                System.out.print("ENTER VALUE OF 3RD RESISTOR = ");
                float _3rdresistor_4 = permit.nextFloat();
                System.out.print("ENTER VALUE OF 4TH RESISTOR = ");
                float _4thresistor_4 = permit.nextFloat();


                float preproduction = (_1stresistor_4 * _2ndresistor_4) / (_1stresistor_4 + _2ndresistor_4);
                float postproduction = (_3rdresistor_4 * _4thresistor_4) / (_3rdresistor_4 + _4thresistor_4);
                float finalproduction = (preproduction * postproduction) / (preproduction + postproduction);

                System.out.println("----------------------------------------------------------------------");

                System.out.print("• EQUIVALENT RESISTANCE = ");
                System.out.println(finalproduction);
            }


// ----------------------------------------------------------// branch-3 ka yaha se syru karo----------------------------------------------------------------------------------------------------
            // exactly yaha se




// --------------------------------MAX=4 , BRANCH= 3 ------------------------------------------------------------------------------------------------------------------------------


            if (no_of_branchesofmax_4 == 3) {
                System.out.println("• LET THE THREE BRANCHS OF WIRE BE :-");
                System.out.println(" • BRANCH-A");
                System.out.println(" • BRANCH-B");
                System.out.println(" • BRANCH-C");
                System.out.println("----------------------------------------------------------------------");


                // --------------------------------------------------------------------------------------------------------------------------------------------------------------


                System.out.println("                              BRANCH-A");
                System.out.println("----------------------------------------------------------------------");
                System.out.print("VALUE OF PARALLEL PACKET IN BRANCH-A = ");
                float parallel_packet_in_branch_A = permit.nextFloat();
                System.out.print("VALUE OF SERIES PACKET IN BRANCH-A = ");
                float series_packet_in_branch_A = permit.nextFloat();
                System.out.println("----------------------------------------------------------------------");


// --------------------------------------------------------------------------------------------------------------------------------------------------------------


                System.out.println("                              BRANCH-B");
                System.out.println("----------------------------------------------------------------------");
                System.out.print("VALUE OF PARALLEL PACKET IN BRANCH-B = ");
                float parallel_packet_in_branch_B = permit.nextFloat();
                System.out.print("VALUE OF SERIES PACKET IN BRANCH-B = ");
                float series_packet_in_branch_B = permit.nextFloat();
                System.out.println("----------------------------------------------------------------------");


// --------------------------------------------------------------------------------------------------------------------------------------------------------------


                System.out.println("                              BRANCH-C");
                System.out.println("----------------------------------------------------------------------");
                System.out.print("VALUE OF PARALLEL PACKET IN BRANCH-C = ");
                float parallel_packet_in_branch_C = permit.nextFloat();
                System.out.print("VALUE OF SERIES PACKET IN BRANCH-C = ");
                float series_packet_in_branch_C = permit.nextFloat();
                System.out.println("----------------------------------------------------------------------");


// --------------------------------------------------------------------------------------------------------------------------------------------------------------


                if (parallel_packet_in_branch_A == 0 && series_packet_in_branch_A == 2 && parallel_packet_in_branch_B == 0 && series_packet_in_branch_B == 1 && parallel_packet_in_branch_C == 0 && series_packet_in_branch_C == 1) {

                    System.out.print(" VALUE OF 1ST SERIES RESISTOR IN BRANCH-A = ");
                    float _1st_series_resistor_in_branch_a = permit.nextFloat();
                    System.out.print(" VALUE OF 2ND SERIES RESISTOR IN BRANCH-A = ");
                    float _2nd_series_resistor_in_branch_a = permit.nextFloat();
                    System.out.println("----------------------------------------------------------------------");


                    System.out.print(" VALUE OF RESISTOR IN BRANCH-B = ");
                    float _1st_series_resistor_in_branch_B = permit.nextFloat();
                    System.out.println("----------------------------------------------------------------------");


                    System.out.print(" ENTER VALUE OF RESISTOR IN BRANCH-C = ");
                    float _1st_series_resistor_in_branch_C = permit.nextFloat();
                    System.out.println("----------------------------------------------------------------------");


                    // CALCULATION


                    float sum_of_series = _1st_series_resistor_in_branch_a + _2nd_series_resistor_in_branch_a;

                    float parallel_calculator = (_1st_series_resistor_in_branch_B * _1st_series_resistor_in_branch_C) / (_1st_series_resistor_in_branch_B + _1st_series_resistor_in_branch_C);

                    float finalendgame = (sum_of_series * parallel_calculator) / (sum_of_series + parallel_calculator);


                    System.out.println("----------------------------------------------------------------------");

                    System.out.print("• EQUIVALENT RESISTANCE = ");
                    System.out.println(finalendgame);
                }


                // --------------------------------------------------------------------------------------------------------------------------------------------------------------
/// EXCEPTION CASE /// special case

                if (parallel_packet_in_branch_A == 0 && series_packet_in_branch_A == 1 && parallel_packet_in_branch_B == 0 && series_packet_in_branch_B == 2 && parallel_packet_in_branch_C == 0 && series_packet_in_branch_C == 1) {
                    System.out.print(" VALUE OF RESISTOR IN BRANCH-A = ");
                    float A = permit.nextFloat();

                    System.out.println("----------------------------------------------------------------------");


                    System.out.print(" VALUE OF 1ST SERIES RESISTOR IN BRANCH-B = ");
                    float B1 = permit.nextFloat();
                    System.out.print(" VALUE OF 2ND SERIES RESISTOR IN BRANCH-B = ");
                    float B2 = permit.nextFloat();
                    System.out.println("----------------------------------------------------------------------");


                    System.out.print(" VALUE OF RESISTOR IN BRANCH-C = ");
                    float C = permit.nextFloat();


                    // --------------------------------------------------------------------------------------------------------------------------------------------------------------


                    float sum = B1 + B2;
                    float parallel_part_2_calculator = (sum * C) / (sum + C);

                    float grand_final = (parallel_part_2_calculator * A) / (parallel_part_2_calculator + A);

                    System.out.println("----------------------------------------------------------------------");

                    System.out.print("• EQUIVALENT RESISTANCE = ");
                    System.out.println(grand_final);

                }


// --------------------------------------------------------------------------------------------------------------------------------------------------------------


                if (parallel_packet_in_branch_A == 0 && series_packet_in_branch_A == 1 && parallel_packet_in_branch_B == 0 && series_packet_in_branch_B == 1 && parallel_packet_in_branch_C == 0 && series_packet_in_branch_C == 2) {
                    System.out.print("VALUE OF RESISTOR IN BRANCH-A = ");
                    float branch_A_only_resistor = permit.nextFloat();
                    System.out.print("VALUE OF RESISTOR IN BRANCH-B = ");
                    float branch_B_only_resistor = permit.nextFloat();
                    System.out.print("VALUE OF 1ST RESISTOR IN BRANCH-C = ");
                    float branch_C_1ST_resistor = permit.nextFloat();
                    System.out.print("VALUE OF 2ST RESISTOR IN BRANCH-C = ");
                    float branch_C_2ND_resistor = permit.nextFloat();

                    // calculation


                    float sum5 = branch_C_1ST_resistor + branch_C_2ND_resistor;
                    float lower_parallel_calculator = (branch_B_only_resistor * sum5) / (branch_B_only_resistor + sum5);
                    float endgame2 = (branch_A_only_resistor * lower_parallel_calculator) / (branch_A_only_resistor + lower_parallel_calculator);
                    System.out.println("----------------------------------------------------------------------");

                    System.out.print("• EQUIVALENT RESISTANCE = ");
                    System.out.println(endgame2);
                }



 // --------------------------------------------------------------------------------------------------------------------------------------------------------------



                if (parallel_packet_in_branch_A == 1 && series_packet_in_branch_A == 0 && parallel_packet_in_branch_B == 0 && series_packet_in_branch_B == 1 && parallel_packet_in_branch_C == 0 && series_packet_in_branch_C == 1)
                    {

                        System.out.print(" VALUE OF 1ST RESISTOR IN PARALLEL IN BRANCH-A = ");
                        float _1st_parallel_C_4= permit.nextFloat();
                        System.out.print(" VALUE OF 2ST RESISTOR IN PARALLEL IN BRANCH-A = ");
                        float _2nd_parallel_C_4= permit.nextFloat();
                        System.out.print(" VALUE OF RESISTANCE IN BRANCH-B = ");
                        float _seriesB_C_4= permit.nextFloat();
                        System.out.print(" VALUE OF RESISTANCE IN BRANCH-C = ");
                        float _seriesC_C_4= permit.nextFloat();

// --------------------------------------------------------------------------------------------------------------------------------------------------------------


                        // calculator



                        float parallel_calculator=(_1st_parallel_C_4*_2nd_parallel_C_4)/(_1st_parallel_C_4+_2nd_parallel_C_4);
                        float preproduction2=(parallel_calculator*_seriesB_C_4)/(parallel_calculator+_seriesB_C_4);
                        float post_prdouction=(preproduction2*_seriesC_C_4)/(preproduction2+_seriesC_C_4);
                        System.out.println("----------------------------------------------------------------------");

                        System.out.print("• EQUIVALENT RESISTANCE = ");
                        System.out.println(post_prdouction);



                    }


// --------------------------------------------------------------------------------------------------------------------------------------------------------------


                if (parallel_packet_in_branch_A == 0 && series_packet_in_branch_A == 1 && parallel_packet_in_branch_B == 1 && series_packet_in_branch_B == 0 && parallel_packet_in_branch_C == 0 && series_packet_in_branch_C == 1)
                {

                    System.out.print("VALUE OF RESISTOR IN BRANCH-A = ");
                    float C_5_B_a_R_1= permit.nextFloat();
                    System.out.print("VALUE OF 1ST RESISTOR IN PARALLEL IN BRANCH-B = ");
                    float C_5_B_b_R_1= permit.nextFloat();
                    System.out.print("VALUE OF 2ST RESISTOR IN PARALLEL IN BRANCH-B = ");
                    float C_5_B_b_R_2= permit.nextFloat();
                    System.out.print("VALUE OF RESISTOR IN BRANCH-C = ");
                    float C_5_B_c_R_1= permit.nextFloat();


                    // calculation


                    float parallecalulator=(C_5_B_b_R_1*C_5_B_b_R_2)/(C_5_B_b_R_1+C_5_B_b_R_2);
                    float lowerpartcalculator=(parallecalulator*C_5_B_c_R_1)/(parallecalulator+C_5_B_c_R_1);
                    float upperpartcalculator=(lowerpartcalculator*C_5_B_a_R_1)/(lowerpartcalculator+C_5_B_a_R_1);



                    System.out.println("----------------------------------------------------------------------");

                    System.out.print("• EQUIVALENT RESISTANCE = ");
                    System.out.println(upperpartcalculator);
                }



// --------------------------------------------------------------------------------------------------------------------------------------------------------------


                if (parallel_packet_in_branch_A == 0 && series_packet_in_branch_A == 1 && parallel_packet_in_branch_B == 0 && series_packet_in_branch_B == 1 && parallel_packet_in_branch_C == 1 && series_packet_in_branch_C == 0)
                {

                    System.out.print(" VALUE OF RESISTOR IN BRANCH-A = ");
                    float C_6_B_a_R_1= permit.nextFloat();
                    System.out.print(" VALUE OF RESISTOR IN BRANCH-B = ");
                    float C_6_B_b_R_1= permit.nextFloat();
                    System.out.print("VALUE OF 1ST RESISTOR IN PARALLEL IN BRANCH-C = ");
                    float C_6_B_c_R_1= permit.nextFloat();
                    System.out.print("VALUE OF 2ND RESISTOR IN PARALLEL IN BRANCH-C = ");
                    float C_6_B_c_R_2= permit.nextFloat();



 // --------------------------------------------------------------------------------------------------------------------------------------------------------------

                    // calculation

                    float parallelcalculator=(C_6_B_c_R_1*C_6_B_c_R_2)/(C_6_B_c_R_1+C_6_B_c_R_2);
                    float uppercalculator=(parallelcalculator*C_6_B_b_R_1)/(parallelcalculator+C_6_B_b_R_1);
                    float mostuppercalculator=(uppercalculator*C_6_B_a_R_1)/(uppercalculator+C_6_B_a_R_1);




                    System.out.println("----------------------------------------------------------------------");

                    System.out.print("• EQUIVALENT RESISTANCE = ");
                    System.out.println(mostuppercalculator);

 // --------------------------------------------------------------------------------------------------------------------------------------------------------------


                }


            }




                }
            }
        }

//----------------------------------------------------------------THE END FOR MAX 4 RESISTOR----------------------------------------------------------------------------------------------------------------





