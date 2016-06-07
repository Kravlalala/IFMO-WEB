/**
 * Created by 1 on 03.05.2016.
 */
$( function() {
    $('#hello_text').click( function() {
        var task= 0;
        $('#say_hello').load( "/FormReading?task="+task);
    } );

    $('#calc').click( function() {
        var  task= 1;
        var num1 = $('#num1').val();
        var num2 = $('#num2').val();
        var operation = $('#operation').val();
        $('#result').load( "/FormReading?task="+task+"&num1="+num1+"&num2="+num2+"&operation="+operation);
    } );

        $('#check').click( function() {
        var task=2;
        var var1 = $('#var1').val();
        var var2 = $('#var2').val();
        $('#checking').load( "/FormReading?task="+task+"&var1="+var1+"&var2="+var2);
    } );

    $('#equation').click( function() {
        var task= 3;
        var a = $('#a').val();
        var b = $('#b').val();
        var c = $('#c').val();
        $('#answer').load( "/FormReading?task="+task+"&a="+a+"&b="+b+"&c="+c);
    } );
    $('#first_arr').click( function() {
        var task= 4;
        $('#output_1arr').load( "/FormReading?task="+task);
    } );
    $('#second_arr').click( function() {
        var task= 5;
        $('#output_2arr').load( "/FormReading?task="+task);
    } );
    
} );
