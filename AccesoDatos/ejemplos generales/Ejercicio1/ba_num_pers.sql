set serveroutput on
declare
v_num number;
v_media float;
begin
num_pers_media(v_num, v_media);
dbms_output.put_line('Contador: ' || v_num);
if v_media < 25 then
dbms_output.put_line('Media: ' || v_media);
end if;
end;
/