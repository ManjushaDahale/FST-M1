-- Update the grade score of salesmen from Rome to 200.
UPDATE salesman SET grade=200 WHERE salesmen_city='Rome';

-- Update the grade score of James Hoog to 300.
UPDATE salesman SET grade=300 WHERE salesmen_name='James Hoog';

-- Update the name McLyon to Pierre.
UPDATE salesman SET salesmen_name='Pierre' WHERE salesmen_name='McLyon';

-- Display modified data
SELECT * FROM salesman;