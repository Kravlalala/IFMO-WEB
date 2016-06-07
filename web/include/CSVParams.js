/**
 * Created by 1 on 07.06.2016.
 */
$( function() {
    $('#Adm').click( function() {
        var task= "Адмиралтейский";
        $('#out').load( "/CSVParsing?task="+task);
    } );
    $('#Vas').click( function() {
        var task= "Васильеостровский";
        $('#out').load( "/CSVParsing?task="+task);
    } ); 
    $('#Vyb').click( function() {
        var task= "Выборгский";
        $('#out').load( "/CSVParsing?task="+task);
    } );
    $('#Kal').click( function() {
        var task= "Калининский";
        $('#out').load( "/CSVParsing?task="+task);
    } );
    $('#Kir').click( function() {
        var task= "Кировский";
        $('#out').load( "/CSVParsing?task="+task);
    } );
    $('#Kol').click( function() {
        var task="Колпинский";
        $('#out').load( "/CSVParsing?task="+task);
    } );
    $('#Nev').click( function() {
        var task= "Невский";
        $('#out').load( "/CSVParsing?task="+task);
    } );
    $('#Pet').click( function() {
        var task= "Пероградский";
        $('#out').load( "/CSVParsing?task="+task);
    } );
    $('#Prim').click( function() {
        var task= "Приморский";
        $('#out').load( "/CSVParsing?task="+task);
    } );
    $('#Fr').click( function() {
        var task= "Фрунзенский";
        $('#out').load( "/CSVParsing?task="+task);
    } );
    $('#Cen').click( function() {
        var task= "Центральный";
        $('#out').load( "/CSVParsing?task="+task);
    } );
} );
