 import  java.util.*;
class  zodiacSign
{
public  static void  main(String[] args)
{
Scanner  sc = new  Scanner (System.in);
System.out.println("Enter your name");
String name=sc.next();
System.out.println("Enter the month of birth (in number)");
int  month=sc.nextInt();
System.out.println("Enter the date of birth ");
int  date=sc.nextInt();
if(month==3&&date>=21&&date<=31||month==4&&date>=1&&date<=20)
{
if(month==3)
System.out.println("You were  born in March");
if(month==4)
System.out.println("YOU were born in April");
System.out.println("Your name "+name+" says your sun sign ARIES");
System.out.println("Commonly believed to be one of the most powerful and fundamental star signs. \n You like to be your own master. \n you are enthusiastic, exuberant, extrovert, independent, fearless and self-reliant. \n You  like to thrive a competition on the harder the better. \n You  have a big ego. \n  You are sure that you are the undisputed monarch of all survey. \n Violence and sex drive are Arian characters.");
}
if(month==4&&date>=21&&date<=31||month==5&&date>=1&&date<=21)
{
if(month==5)
System.out.println("You were born in May");
if(month==4)
System.out.println("You were born in April");
System.out.println("Your name "+name+" says your sign TAURAS");
System.out.println("Materialism and artistic tendencies wage a royal battle in you. \n So while some call you money-mad, others call you arty. \n You have remarkable memory and often remember any insult or injury done to you. \n  You have your own principles and stick to them rigidly. \n You are an excellent host. \n  You are solid and steady and nothing disturb your tranquility. \n You like honest and frank people.");
}
if(month==5&&date>=22&&date<=31||month==6&&date>=1&&date<=21)
{
if(month==5)
System.out.println("You were born in May");
if(month==6)
System.out.println("You were born in June");
System.out.println("Your name "+name+" says your sun sign GEMINI");
System.out.println("An over plus of intellectual energy reveals the Gemini. \n This radiates in your remarkable versatile. \n  You Gemini are or can be extremely charming, witty, outgoing and attractive. \n You are kind, generous, very creative and full of ideas and rather restless until you fulfill your aim and ambition in your life. \n But you are not easily satisfied. \n You approach to life in practical and realistic. \n Expression and communication are your plus factors.");
}
if(month==6&&date>=22&&date<=31||month==7&&date>=1&&date<=23)
{
if(month==6)
System.out.println("You were born in July");
if(month==7)
System.out.println("You were born in June");
System.out.println("Your name "+name+" says your sun sign CANCER");
System.out.println("cancerians may be attached to their home and family, but they also seek limelight and publicity. \n If you are born under this sign you may find yourself clannish and an ardent admirer of things a matters traditional. \n Sincere as a friend, you are easily involved with those who exhibit the slightest sympathy towards you. \n Tenacity often helps you achieve the impossible. \n You are also well of secrecy. \n People automatically confide in you. \n You regard your inner feelings carefully from prying eyes.");
}
if(month==7&&date>=24&&date<=31||month==8&&date>=1&&date<=23) 
{
if(month==8)
System.out.println("You were born in August");
if(month==7)
System.out.println("You were born in July");
System.out.println("Your name "+name+" says yours sun sign LEO");
System.out.println("Yours is the most powerful and dynamic sign of all zodiac. \n If you are born under this sign you may have a royal bearing. \n Your manner of greeting people is very friendly. \n You believe yourself to be a shade better than others and like to stay aloof. \n Highly principled, you dislike those who are superficial or those who have no aim and direction in life. \n You are natural head of any organisation. \n You are a good judge of characters and one of your favourite pastimes is to observe others.");
   }
if(month==8&&date>=24&&date<=31||month==9&&date>=1&&date<=23)
{
if(month==8)
System.out.println("You were born in August");
if(month==9)
System.out.println("You were born in September");
System.out.println("Your name "+name+" says yours sun sign VIRGO");
System.out.println("You are a happy-go-lucky type.\n You take life as it comes and accept others as they are. \n Through quiet finicky, you are a practical person with a definite goal in life. \n Remarkable power of analysis and fine sense of discrimination characterize you. \n You generally have a large circle of friends but occasionally take their advice when annoyed by vulgarity, stupidity. \n Suddenly become cranky, irritable and nervous.");
}
if(month==9&&date>=24&&date<=31||month==10&&date>=1&&date<=23)
{
if(month==10)
System.out.println("You were born in October");
if(month==9)
System.out.println("You were born in September");
System.out.println("You name "+name+" says yours sun sign LIBRA");
System.out.println("Librans show their aggression on the intellectual plane and areas of public affairs, marriage and foreign affairs. \n You are intelligent and have great intellectual brilliance. \n You have refined tastes and artistic blend of mind. \n Your voice is soft and gentle and there is always a smile on your face. \n Skillful in discussion and quite tactful.");
}
if(month==10&&date>=24&&date<=31||month==11&&date>=1&&date<=22)
{
if(month==10)
System.out.println("You were born in October");
if(month==11)
System.out.println("You were born in November");
System.out.println ("You name "+name+" says yours sun sign SCORPIO");
System.out.println("Essentially adventurous, you are born leader, it is absolutely certain that you will carve out a distinct path for yourself. \n You are dignified in your bearing reserved by nature single mindedness, thoughtness, self-discipline and courage are your strong point. \n You are keen observer extremely interpretive, analytically and highly intuitive and well determined in pursuit of your goals.");
}
if(month==11&&date>=23&&date<=31||month==12&&date>=1&&date<=21)
{
if(month==11)
System.out.println("You were born in November");
if(month==12)
System.out.println("You were born in December");
System.out.println("Your name "+name+" says yours sun sign SAGITTARIUS");
System.out.println("You are optimistic, friendly, kind, jovial and versatile. \n You have bright frank ways. \n You are tremondously curious and therefore ask the why of things. \n You are bold and optimistic and always aim for the highest place in your career or the profession you chose. \n You have plenty of self -confidence to attain your goal in life. \n Your progressive and enterprising attitude makes you extremely successful. \n You have a good sense of humor and are a good conversationalist.");
}
if(month==12&&date>=22&&date<=31||month==1&&date>=1&&date<=20)
{
if(month==12)
System.out.println("You were born in December");
if(month==1)
System.out.println("You were born in January");
System.out.println("You name "+name+" says yours sun sign CAPRICORN");
System.out.println("You have tremendous drive organizing ability and overwhelming ambition. \n You are known for a single-minded and realistic approach to life. /n There is always faint aura of melancholy and seriousness surrounding your personality. \n You are sensitive to beautiful environment. \n Accorded, crude or ugly things repel you. \n You make a perfect diplomat. \n You believe in goodwill to all");
}
if(month==1&&date>=21&&date<=31||month==2&&date>=1&&date<=19)
{
if(month==1)
System.out.println("You were born in January");
if(month==2)
System.out.println("You were born in February");
System.out.println("You name "+name+" says yours sun sign AQUARIUS");
System.out.println("You are friendly and know a large number of people, but are afraid to have close ties with anyone. \n You feel more secure in your seclusion. \n You don't easily confide in others. \n Nor that you disturb them or are suspicious, but perhaps you do not feel the need to have any close intimate. \n You are a thinker, sensitive to others sufferings and compassionate by nature. \n You live in tomorrow and what you say usually come true.");
}
if(month==2&&date>=20&&date<=31||month==3&&date>=1&&date<=20)
{
if(month==2)
System.out.println("You were born in February");
if(month==3)
System.out.println("You were born in March");
System.out.println("You name "+name+" says yours sun sign PISCES");
System.out.println("Anybody will be charmed by your Piscean charm of manner and lazy good nature, \n There is very little which excites you Pisceans to violent action or reaction. \n You are quite but not an introvert and are completely by emotions. \n You are versatile and talented, but may lack direction at times. \n You can make others forget their miseries and trouble. \n A short conversation with you and a person instantly relaxes.");
}
}
}
