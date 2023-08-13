SELECT employee_id,                                                    
CASE WHEN employee_id%2 <> 0 AND name not like 'M%' THEN salary    
ELSE 0                                                            
END as bonus FROM Employees                           
ORDER BY employee_id;