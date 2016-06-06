/**
 * Created by 1 on 06.06.2016.
 */
$( function() {

    $('#check_mail').click( function() {
        var task="1";
        var email= $('#email').val();
        $('#result_mail').load( "/Validation?task="+task+"&email="+email);
    } );
    $('#check_password').click( function() {
        var task=2;
        var password= $('#password').val();
        $('#result_password').load( "/Validation?task="+task+"&password="+password);
    } );
    $('#check_byte_string').click( function() {
        var task=3;
        var byte_string= $('#byte_string').val();
        $('#result_byte_string').load( "/Validation?task="+task+"&byte_string="+byte_string);
    } );
    $('#check_number').click( function() {
        var task=4;
        var number= $('#number').val();
        $('#result_number').load( "/Validation?task="+task+"&number="+number);
    } );
} );
