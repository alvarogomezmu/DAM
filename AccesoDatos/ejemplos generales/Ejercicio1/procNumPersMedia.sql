create or replace procedure num_pers_media(num_pers out number, media_edad out float) is 
begin
select count(nombre), avg(edad) into num_pers, media_edad from personas;
end num_pers_media;
/

