select sexo, count(*) as cantidad
from pacientes
group by sexo