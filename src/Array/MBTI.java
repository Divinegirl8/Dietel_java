package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MBTI {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int countA = 0;
        int countB = 0;

        System.out.println("What is your name: ");
        String name = scan.nextLine();

        System.out.println("Answer the following questions with (A or B)");

        String[] question = {
                "expend energy, enjoy groups" ,"conserve energy, enjoy one-on-one",
                "Interpret literally"    ,"look for meaning and possibilities",
                "logical,thinking,questioning"    ,"empathetic, feeling, accommodating",
                "organized,orderly"    ,        "flexible, adaptable",
                "more outgoing,think out loud"   ,   "more reserved, think to yourself",
                "practical, realistic, experiential"  , "imaginative, innovative, theoretical",
                "candid, straight, forward, frank" ,   "tactful, kind, encouraging",
                "plan, schedule" ,       "unplanned, spontaneous",
                "seek many tasks, public activities, interaction with others" ,  "seek private, solitary activities with quiet to concentrate",
                "standard, usual, conventional" ,     " different, novel, uniques",
                "firm, tend to criticize, hold the line"  ,  "gentle, tend to appreciate, conciliate ",
                "regulated, structured"          , "easy-going,live and let live",
                "external, communicative, express yourself" ,    "internal, reticent, keep to yourself",
                "focus on here-and-now" ,        "look to the future, global perspective, big picture",
                "tough-minded, just " ,            "tender-hearted, merciful",
                "preparation, plan ahead" ,       "go with the flow, adapt as you go",
                "active, initiate"  ,                  "reflective, deliberate ",
                "facts, things, what is " ,         "ideas, dreams, what could be, philosophical",
                "matter of fact, issue-oriented " ,   "sensitive, people-oriented, compassionate",
                "control, govern"  ,              "latitude, freedom"
        };


        StringBuilder response = new StringBuilder();
        String ans = "";

        String[] store = new String[question.length / 2];


        for (int count = 0; count < question.length; count+=2) {

            System.out.println("A. "+question[count] + "     B." + question[count + 1]);
            ans = scan.nextLine().trim().toUpperCase();
             


                while ((ans.matches("\\d+") || !(ans.equals("A") || ans.equals("B")))) {
                    System.out.println("""
                            Expected A or B as Response
                            I know this is an error, please retry again
                            """);
                    ans = scan.nextLine().toUpperCase();
                }


            if (ans.equals("A")) {
                response.append("A. ").append(question[count]).append("\n");
            }
            if (ans.equals("B")) {
                response.append("B. ").append(question[count + 1]).append("\n");
            }

           store[count / 2] = ans;

            }

        String changeToString = response.toString();
        String[] changeToArray = changeToString.split("\n");





        System.out.printf("Hello %s you selected:  %n" ,name);
        int increment = 5;
        for (int index = 0; index < changeToArray.length; index += increment) {
            countA = 0;
            countB = 0;

            for (int i = index; i < index + increment; i++) {
                System.out.println(changeToArray[i]);
                if (store[i].equals("A")) {
                    ++countA;
                }
                if (store[i].equals("B")) {
                    ++countB;
                }
            }
            System.out.printf("""
                    Number of A selected: %d
                    Number of B selected: %d%n
                    """,countA,countB);

            System.out.println();


        }

        String  personalityType = " ";

   for (int check = 0 ; check < store.length; check +=4){
       personalityType = (store[check].equals("A") ? "E": "I") + (store[check + 1].equals("A") ? "S": "N") + (store[check + 2].equals("A") ? "T": "F") + (store[check + 3].equals("A") ? "J": "P");

    }

   if(personalityType.equals("INFP")){
        System.out.println("""
                INFP
                      Healer
                      The Thoughtful Idealist (MBTI)
                      The Mediator (16Personalisties)
                      
                      
                The INFP Personality Type
                INFPs are imaginative idealists, guided by their own core values and beliefs.
                   To a Healer , possibilities are paramount; the realism of the moment is only
                   of passing concern. They see potential for a better future, and pursue truth
                   and meaning with their own individual flair.
                INFPs are sensitive, caring, and compassionate, and are deeply concerned with
                   the personal growth of themselves and others. Individualistic and
                   nonjudgemental, INFPs believe that each person must find their own path. They
                   enjoy spending time exploring their own ideas and values, and are gently
                   encouraging to others to do the same. INFPs are creative and often artistic;
                   they enjoy finding new outlets for self-expression.
                
                What does INFP stand for?
                INFP is one of the sixteen personality types created by Katherine Briggs and
                   Isabel Myers, creators of the Myers-Briggs Type Indicator (MBTI). INFP
                   stands for Introversion, Intuition, Feeling, and Perceiving, which are four
                   core personality traits based on the work of pyschologist C.G. Jung.
                Each of the four letters of the INFPs code signifies a key personality trait of
                   this type. INFPs are energized by time alone (Introverted), focus on ideas
                   and concepts rather than facts and details (iNtuitive), make decisions based
                   on feelings and values (Feeling), and prefer to be spontaneous and flexible
                   rather than planned and organized (Perceiving).
               
                   
                """);}

        if(personalityType.equals("INFJ")){
            System.out.println("""
                    INFJ
                           The Advocate (16Personalisties)
                    
                    The INFJ Personality Type
                        Advocates (INFJs) may be the rarest personality type of all, but they certainly
                        leave their mark on the world. Idealistic and principled, they aren’t content to
                        coast through life – they want to stand up and make a difference. For Advocate personalities,
                        success doesn’t come from money or status but from seeking fulfillment, helping others,
                        and being a force for good in the world.
                        
                        While they have lofty goals and ambitions, Advocates shouldn’t be mistaken for idle dreamers.
                        People with this personality type care about integrity, and they’re rarely satisfied until
                        they’ve done what they know to be right. Conscientious to the core, they move through life with a clear
                        sense of their values, and they aim never to lose sight of what truly matters – not according to other people
                        or society at large, but according to their own wisdom and intuition.
                        
                        Who is An Advocate (INFJ)?
                        
                        An Advocate (INFJ) is someone with the Introverted, Intuitive, Feeling, and Judging personality traits.
                        They tend to approach life with deep thoughtfulness and imagination. Their inner vision, personal values,
                         and a quiet, principled version of humanism guide them in all things.
                    
                    """);}

        if(personalityType.equals("INTJ")){
            System.out.println("""
                    INTJ
                           The Architect (16Personalisties)
                           
                    The INTJ Personality Type
                           It can be lonely at the top. As one of the rarest personality types
                           – and one of the most capable – Architects (INTJs) know this all too well.
                           Rational and quick-witted, Architects pride themselves on their ability to think for themselves,
                            not to mention their uncanny knack for seeing right through phoniness and hypocrisy.
                            But because their minds are never at rest, Architects may struggle to find people who can keep up with their
                            nonstop analysis of everything around them.
                            
                            Architects question everything. Many personality types trust the status quo, relying on conventional wisdom and
                            other people’s expertise to guide their lives. But ever-skeptical Architects prefer to make their own discoveries.
                            In their quest to find better ways of doing things, they aren’t afraid to break the rules or risk disapproval
                            – in fact, they rather enjoy it.
                            
                            
                            Who is An Architect (INTJ)?
                            
                            An Architect (INTJ) is a person with the Introverted, Intuitive, Thinking, and Judging personality traits.
                            These thoughtful tacticians love perfecting the details of life, applying creativity and rationality to everything they do.
                            Their inner world is often a private, complex one.
                    """);}

        if(personalityType.equals("INTP")){
            System.out.println("""
                     INTP
                           The Logician (16Personalisties)
                           
                    The INTP Personality Type
                         Logicians pride themselves on their unique perspectives and vigorous intellect.
                         They can’t help but puzzle over the mysteries of the universe – which may explain why some of the most influential philosophers
                         and scientists of all time have been Logicians.  This personality type is fairly rare, but with their creativity and inventiveness,
                         Logicians aren’t afraid to stand out from the crowd.
                         
                         Logicians often lose themselves in thought – which isn’t necessarily a bad thing. People with this personality type hardly ever stop thinking.
                         From the moment they wake up, their minds buzz with ideas, questions, and insights. At times, they may even find themselves
                         conducting full-fledged debates in their own heads.
                         
                         Who is A Logician (INTP)?
                         
                         A Logician (INTP) is someone with the Introverted, Intuitive, Thinking, and Prospecting personality traits.
                         These flexible thinkers enjoy taking an unconventional approach to many aspects of life.
                         They often seek out unlikely paths, mixing willingness to experiment with personal creativity.
                    """);}

        if(personalityType.equals("ENTJ")){
            System.out.println("""
                    ENTJ
                           The Commander (16Personalisties)
                    
                    The ENTJ Personality Type
                         Commanders are natural-born leaders. People with this personality type embody the gifts of charisma and confidence,
                         and project authority in a way that draws crowds together behind a common goal. However, Commanders are also characterized
                         by an often ruthless level of rationality, using their drive, determination and sharp minds to achieve whatever end they’ve set for themselves.
                         Perhaps it is best that they make up only three percent of the population, lest they overwhelm the more timid and sensitive personality types
                         that make up much of the rest of the world – but we have Commanders to thank for many of the businesses and institutions we take for granted every day.
                         
                         If there’s anything Commanders love, it’s a good challenge, big or small, and they firmly believe that given enough time and resources,
                         they can achieve any goal. This quality makes people with the Commander personality type brilliant entrepreneurs,
                         and their ability to think strategically and hold a long-term focus while executing each step of their plans with determination and precision
                         makes them powerful business leaders. This determination is often a self-fulfilling prophecy, as Commanders push their goals through with sheer
                         willpower where others might give up and move on, and their Extraverted (E) nature means they are likely to push everyone else right along with them,
                         achieving spectacular results in the process.
                         
                         Who is A Commander (ENTJ)?
                         
                         A Commander (ENTJ) is someone with the Extraverted, Intuitive, Thinking, and Judging personality traits.
                         They are decisive people who love momentum and accomplishment. They gather information to construct their creative visions
                         but rarely hesitate for long before acting on them.
                    """);}

        if(personalityType.equals("ENTP")){
            System.out.println("""
                    ENTP
                         The Debater (16Personalisties)
                                          
                    The ENTP Personality Type
                         Quick-witted and audacious, Debaters aren’t afraid to disagree with the status quo. In fact,
                         they’re not afraid to disagree with pretty much anything or anyone. Few things light up people with this personality type
                         more than a bit of verbal sparring – and if the conversation veers into controversial terrain, so much the better.
                         It would be a mistake, though, to think of Debaters as disagreeable or mean-spirited.
                         Instead, people with this personality type are knowledgeable and curious, with a playful sense of humor,
                         and they can be incredibly entertaining. They simply have an offbeat, contrarian idea of fun – one that involves a healthy dose of spirited debate.
                         
                         Debaters are known for their rebellious streak. For this personality type, no belief is too sacred to be questioned,
                         no idea is too fundamental to be scrutinized, and no rule is too important to be broken, or at least thoroughly tested.
                         Sometimes Debaters even rebel against their own beliefs by arguing the opposing viewpoint – just to see how the world looks from the other side.
                                         
                         Who is A Debater (ENTP)?
                       
                         A Debater (ENTP) is a person with the Extraverted, Intuitive, Thinking, and Prospecting personality traits.
                         They tend to be bold and creative, deconstructing and rebuilding ideas with great mental agility.
                         They pursue their goals vigorously despite any resistance they might encounter.
                                         """);}

        if(personalityType.equals("ENFJ")){
            System.out.println("""
                    ENFJ
                         The Protagonists (16Personalisties)
                                          
                    The ENFJ Personality Type
                         Protagonists (ENFJs) feel called to serve a greater purpose in life. Thoughtful and idealistic,
                         these personality types strive to have a positive impact on other people and the world around them.
                         They rarely shy away from an opportunity to do the right thing, even when doing so is far from easy.
                         
                         Protagonists are born leaders, which explains why these personalities can be found among many notable politicians, coaches, and teachers.
                         Their passion and charisma allow them to inspire others not just in their careers but in every arena of their lives, including their relationships.
                         Few things bring Protagonists a deeper sense of joy and fulfillment than guiding friends and loved ones to grow into their best selves.
                         
                         Who is A Protagonist (ENFJ)?
                         
                         A Protagonist (ENFJ) is a person with the Extraverted, Intuitive, Feeling, and Judging personality traits.
                         These warm, forthright types love helping others, and they tend to have strong ideas and values.
                         They back their perspective with the creative energy to achieve their goals.
                    """);}


        if(personalityType.equals("ENFP")){
            System.out.println("""
                    ENFP
                         The Protagonists (16Personalisties)
                                          
                    The ENFP Personality Type
                        Campaigners (ENFPs) are true free spirits – outgoing, openhearted, and open-minded. With their lively, upbeat approach to life,
                        they stand out in any crowd. But even though they can be the life of the party, Campaigners don’t just care about having a good time.
                        These personality types run deep – as does their longing for meaningful, emotional connections with other people.
                        
                        Friendly and outgoing, Campaigners are devoted to enriching their relationships and their social lives.
                        But beneath their sociable, easygoing exteriors, they have rich, vibrant inner lives as well. Without a healthy dose of imagination,
                        creativity, and curiosity, a Campaigner simply wouldn’t be a Campaigner.
                        
                        In their unique way, Campaigners can be quite introspective. They can’t help but ponder the deeper meaning and significance of life
                        – even when they should be paying attention to something else. These personalities believe that everything – and everyone – is connected,
                        and they live for the glimmers of insight that they can gain into these connections.
                        
                        Who is A Campaigner (ENFP)?
                        
                        A Campaigner (ENFP) is someone with the Extraverted, Intuitive, Feeling, and Prospecting personality traits.
                        These people tend to embrace big ideas and actions that reflect their sense of hope and goodwill toward others.
                        Their vibrant energy can flow in many directions.
                    
                    """);}

        if(personalityType.equals("ISTJ")){
            System.out.println("""
                    ISTJ
                         The Logistician (16Personalisties)
                                          
                    The ISTJ Personality Type
                         Logisticians pride themselves on their integrity. People with this personality type mean what they say,
                         and when they commit to doing something, they make sure to follow through.
                         This personality type makes up a good portion of the overall population, and while Logisticians may not be particularly flashy
                         or attention-seeking, they do more than their share to keep society on a sturdy, stable foundation. In their families and their communities,
                         Logisticians often earn respect for their reliability, their practicality, and their ability to stay grounded and logical, even in the most stressful situations.
                         
                         The core of Logisticians’ self-respect comes from a sense of personal integrity. People with this personality type believe that there
                         is a right way to proceed in any situation – and that anyone who pretends otherwise is probably trying to bend the rules to suit their own purposes.
                         Logisticians have a deep respect for structure and tradition, and they are often drawn to organizations, workplaces, and educational settings that
                         offer clear hierarchies and expectations.
                         
                         Who is A Logistician (ISTJ)?
                         
                         A Logistician (ISTJ) is someone with the Introverted, Observant, Thinking, and Judging personality traits.
                         These people tend to be reserved yet willful, with a rational outlook on life. They compose their actions carefully and
                         carry them outwith methodical purpose.
                    """);}

        if(personalityType.equals("ISFJ")){
            System.out.println("""
                    ISFJ
                         The Defender (16Personalisties)
                                          
                    The ISFJ Personality Type
                        In their unassuming, understated way, Defenders help make the world go round. Hardworking and devoted,
                        people with this personality type feel a deep sense of responsibility to those around them. Defenders can be counted on to meet deadlines,
                        remember birthdays and special occasions, uphold traditions, and shower their loved ones with gestures of care and support. But they rarely
                        demand recognition for all that they do, preferring instead to operate behind the scenes.
                        
                        This is a capable, can-do personality type, with a wealth of versatile gifts. Though sensitive and caring,
                        Defenders also have excellent analytical abilities and an eye for detail. And despite their reserve,
                        they tend to have well-developed people skills and robust social relationships. Defenders are truly more than the sum of their parts,
                        and their varied strengths shine in even the most ordinary aspects of their daily lives.
                        
                        Who is A Defender (ISFJ)?
                        
                        A Defender (ISFJ) is someone with the Introverted, Observant, Feeling, and Judging personality traits.
                        These people tend to be warm and unassuming in their own steady way. They’re efficient and responsible, giving careful attention to
                        practical details in their daily lives.
                    
 
                    """);}

        if(personalityType.equals("ESTJ")){
            System.out.println("""
                    ESTJ
                         The Executive (16Personalisties)
                                          
                    The ESTJ Personality Type
                        Executives are representatives of tradition and order, utilizing their understanding of what is right,
                        wrong and socially acceptable to bring families and communities together. Embracing the values of honesty,
                        dedication and dignity, people with the Executive personality type are valued for their clear advice and guidance,
                        and they happily lead the way on difficult paths. Taking pride in bringing people together, Executives often take on roles as community organizers,
                        working hard to bring everyone together in celebration of cherished local events, or in defense of the traditional values that hold
                        families and communities together.
                        
                        Executives are aware of their surroundings and live in a world of clear, verifiable facts – the surety of their knowledge means that even against heavy resistance,
                        they stick to their principles and push an unclouded vision of what is and is not acceptable. Their opinions aren’t just empty talk either, as Executives are
                        more than willing to dive into the most challenging projects, improving action plans and sorting details along the way, making even the most complicated
                        tasks seem easy and approachable.
                        
                        Who is An Executive (ESTJ)?
                        
                        An Executive (ESTJ) is someone with the Extraverted, Observant, Thinking, and Judging personality traits.
                        They possess great fortitude, emphatically following their own sensible judgment. They often serve as a stabilizing force among others,
                        able to offer solid direction amid adversity.
                    
                    
                    """);}

        if(personalityType.equals("ESFJ")){
            System.out.println("""
                    ESFJ
                         The Consul (16Personalisties)
                                          
                    The ESFJ Personality Type
                        For Consuls, life is sweetest when it’s shared with others. People with this personality type form the bedrock of many communities,
                        opening their homes – and their hearts – to friends, loved ones, and neighbors. This doesn’t mean that Consuls like everyone,
                        or that they’re saints. But Consuls do believe in the power of hospitality and good manners, and they tend to feel a sense of duty
                        to those around them. Generous and reliable, people with this personality type often take it upon themselves – in ways both large and small – 
                        to hold their families and their communities together. "
                        
                        Consuls are altruists. They take seriously their responsibilities to give back, serve others, and do the right thing.
                        And Consuls believe that there is a clear right thing to do in nearly every situation. While some personality types adopt a more lenient,
                        live-and-let-live attitude, Consuls may find it difficult not to judge when someone takes a path that strikes them as misguided. As a result,
                        Consuls often struggle to accept it when someone – particularly someone they care about – disagrees with them.
                        
                        Who is A Consul (ESFJ)?
                        
                        A Consul (ESFJ) is a person with the Extraverted, Observant, Feeling, and Judging personality traits.
                        They are attentive and people-focused, and they enjoy taking part in their social community. Their achievements are guided by decisive values, 
                        nd they willingly offer guidance to others.
                        """);}

        if(personalityType.equals("ISTP")) {
            System.out.println("""
                    ISTP
                         The Virtuoso (16Personalisties)
                                        
                    The ISTP Personality Type
                        Virtuosos love to explore with their hands and their eyes, touching and examining the world around them with cool rationalism and spirited curiosity.
                        People with this personality type are natural Makers, moving from project to project, building the useful and the superfluous for the fun of it,
                        and learning from their environment as they go. Often mechanics and engineers, Virtuosos find no greater joy than in getting their hands dirty
                        pulling things apart and putting them back together, just a little bit better than they were before.
                                        
                        Virtuosos explore ideas through creating, troubleshooting, trial and error and first-hand experience. They enjoy having other people take an
                        interest in their projects and sometimes don’t even mind them getting into their space. Of course, that’s on the condition that those people don’t
                        interfere with Virtuosos’ principles and freedom, and they’ll need to be open to Virtuosos returning the interest in kind. Virtuosos enjoy lending
                        a hand and sharing their experience, especially with the people they care about, and it’s a shame they’re so uncommon, making up only about five
                        percent of the population. Virtuoso women are especially rare, and the typical gender roles that society tends to expect can be a poor fit
                        - they’ll often be seen as tomboys from a young age.
                        
                        Who is A Virtuoso (ISTP)?
                        
                        A Virtuoso (ISTP) is someone with the Introverted, Observant, Thinking, and Prospecting personality traits.
                        They tend to have an individualistic mindset, pursuing goals without needing much external connection. They engage in life with inquisitiveness
                        and personal skill, varying their approach as needed.
                    """);}

        if(personalityType.equals("ISFP")) {
            System.out.println("""
                    ISFP
                         The Adventurer (16Personalisties)
                         
                    The ISFP Personality Type
                        Adventurers are true artists – although not necessarily in the conventional sense. For this personality type, life itself is a canvas
                        for self-expression. From what they wear to how they spend their free time, Adventurers act in ways that vividly reflect who they are as unique individuals.
                        And every Adventurer is certainly unique. Driven by curiosity and eager to try new things, people with this personality often have a fascinating
                        array of passions and interests. With their exploratory spirits and their ability to find joy in everyday life, Adventurers can be among the
                        most interesting people you’ll ever meet. The only irony? Unassuming and humble, Adventurers tend to see themselves as “just doing their own thing,”
                        so they may not even realize how remarkable they really are.
                        
                        Adventurers embrace a flexible, adaptable approach to life. Some personality types thrive on strict schedules and routines – but not Adventurers.
                        Adventurers take each day as it comes, doing what feels right to them in the moment. And they make sure to leave plenty of room in their lives for the
                        unexpected – with the result that many of their most cherished memories are of spontaneous, spur-of-the-moment outings and adventures,
                        whether by themselves or with their loved ones.
                         """);}

        if(personalityType.equals("ESTP")) {
            System.out.println("""
                    ESTP
                         The Entrepreneur (16Personalisties)
                         
                    The ESTP Personality Type
                        Entrepreneurs always have an impact on their immediate surroundings – the best way to spot them at a party is to look
                        for the whirling eddy of people flitting about them as they move from group to group. Laughing and entertaining with a blunt and earthy humor,
                        Entrepreneur personalities love to be the center of attention. If an audience member is asked to come on stage, Entrepreneurs volunteer –
                        or volunteer a shy friend.
                        
                        Theory, abstract concepts and plodding discussions about global issues and their implications don’t keep Entrepreneurs interested for long.
                        Entrepreneurs keep their conversation energetic, with a good dose of intelligence, but they like to talk about what is – or better yet,
                        to just go out and do it. Entrepreneurs leap before they look, fixing their mistakes as they go, rather than sitting idle,
                        preparing contingencies and escape clauses.
                        
                        Who is An Entrepreneur (ESTP)?
                        
                        An Entrepreneur (ESTP) is someone with the Extraverted, Observant, Thinking, and Prospecting personality traits.
                        They tend to be energetic and action-oriented, deftly navigating whatever is in front of them. They love uncovering life’s opportunities,
                        whether socializing with others or in more personal pursuits.""");}

        if(personalityType.equals("ESFP")) {
            System.out.println("""
                    ESFP
                         The Entertainer (16Personalisties)
                         
                    The ESFP Personality Type
                        If anyone is to be found spontaneously breaking into song and dance, it is the Entertainer personality type.
                        Entertainers get caught up in the excitement of the moment, and want everyone else to feel that way, too. No other personality
                        type is as generous with their time and energy as Entertainers when it comes to encouraging others,
                        and no other personality type does it with such irresistible style.
                        
                        Entertainers love the spotlight, and all the world’s a stage. Many famous people with the Entertainer personality type are indeed actors,
                        but they love putting on a show for their friends too, chatting with a unique and earthy wit, soaking up attention and making every outing feel
                        a bit like a party. Utterly social, Entertainers enjoy the simplest things, and there’s no greater joy for them than just having
                        fun with a good group of friends.
                        
                        Who is An Entertainer (ESFP)?
                        
                        An Entertainer (ESFP) is a person with the Extraverted, Observant, Feeling, and Prospecting personality traits.
                        These people love vibrant experiences, engaging in life eagerly and taking pleasure in discovering the unknown. They can be very social,
                        often encouraging others into shared activities.
                        """);}

    }}

