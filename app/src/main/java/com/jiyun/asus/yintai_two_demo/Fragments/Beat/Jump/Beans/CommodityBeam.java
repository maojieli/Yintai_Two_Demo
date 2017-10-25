package com.jiyun.asus.yintai_two_demo.Fragments.Beat.Jump.Beans;

import java.util.List;

/**
 * 我与世界
 * 格格不入
 * <p>
 * 我只与你
 * 惺惺相惜.
 */

public class CommodityBeam {

    /**
     * isSuccessful : true
     * statusCode : 200
     * description :
     * userId :
     * data : {"announcement":null,"product_list":[],"current":{"brandid":683,"longname":"SWAROVSKI/施华洛世奇水晶小挂件情人节礼物金色5064267全球联保","finalprice":280,"airrate":0,"ppatr":"0%","ppata":0,"description":"","isshowdetail":0,"productdetailhtml":"<!DOCTYPE html><html><head><title>银泰网 - 银泰百货连锁在线购物中心，银泰商业集团官方购物网站<\/title><meta charset='utf-8' /><meta name='viewport' content='initial-scale=1, maximum-scale=1, minimum-scale=1, width=device-width, user-scalable=no' /><meta content='yes' name='apple-mobile-web-app-capable' /><meta content='black' name='apple-mobile-web-app-status-bar-style' /><meta content='telephone=no' name='format-detection' /><meta name='keywords' content='银泰网' /><meta name='description' content='银泰网（www.yintai.com）作为银泰商业集团官方购物网站,专注经营精品时尚百货类，包括女装，男装，鞋靴，化妆品，运动系列，时尚配饰，名品箱包等万种百货商品，100%正品，15天免费退换货。银泰网作为银泰百货连锁在线购物中心，致力打造成为中国最卓越的百货购物网站！' /><link href='https://r.ytrss.com/mobile/css/style.css' rel='stylesheet'  type='text/css'><style type='text/css'>.pro-info-size{width:100%;border:1px solid #ddd;border-collapse:collapse;border-spacing:0;font-size:14px;margin-bottom:15px}.pro-info-size td{width:50%;border:1px solid #ddd;padding:10px 5px;color:#666}.pro-info-size td b{color:#333}.pro-info-title{margin:0 auto 6px;height:26px}.pro-info-title h4{float:left;width:90px;height:26px;line-height:26px;text-indent:10px;font-size:14px;font-weight:700;background:url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAJ4AAAAyCAMAAACahZLcAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAyBpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuMC1jMDYwIDYxLjEzNDc3NywgMjAxMC8wMi8xMi0xNzozMjowMCAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvIiB4bWxuczp4bXBNTT0iaHR0cDovL25zLmFkb2JlLmNvbS94YXAvMS4wL21tLyIgeG1sbnM6c3RSZWY9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9zVHlwZS9SZXNvdXJjZVJlZiMiIHhtcDpDcmVhdG9yVG9vbD0iQWRvYmUgUGhvdG9zaG9wIENTNSBXaW5kb3dzIiB4bXBNTTpJbnN0YW5jZUlEPSJ4bXAuaWlkOjYxNTAwM0I0MEY1OTExRTU4M0MxOEI5QjQ4MzlEMDM4IiB4bXBNTTpEb2N1bWVudElEPSJ4bXAuZGlkOjYxNTAwM0I1MEY1OTExRTU4M0MxOEI5QjQ4MzlEMDM4Ij4gPHhtcE1NOkRlcml2ZWRGcm9tIHN0UmVmOmluc3RhbmNlSUQ9InhtcC5paWQ6NjE1MDAzQjIwRjU5MTFFNTgzQzE4QjlCNDgzOUQwMzgiIHN0UmVmOmRvY3VtZW50SUQ9InhtcC5kaWQ6NjE1MDAzQjMwRjU5MTFFNTgzQzE4QjlCNDgzOUQwMzgiLz4gPC9yZGY6RGVzY3JpcHRpb24+IDwvcmRmOlJERj4gPC94OnhtcG1ldGE+IDw/eHBhY2tldCBlbmQ9InIiPz7mwj00AAAARVBMVEXq6ur////c3Nz+/v7s7Ozu7u7r6+v29vb9/f34+Pj19fX7+/v5+fnt7e339/fv7+/w8PDy8vL8/Pzz8/Px8fH09PT6+vp3BjvhAAAAyklEQVR42szXSRKCQBBFwUJoRAUBQe9/VAUHwHBv1gkyevNfx26+bLr4392y3xcGr7N5cbJ5o82Li83rbV5UNm+weWVF8+Jq88qc5sXR5hU5zYu9zWtsXpxtXrJ5cbB5yeZFbfM6m/dV9RxvtHnb5/N4vc3bfIpA3mDz1lUP8tZVL/JWVS/yVlVP8paqJ3lL1Zu8wuZ9qh7lNTbvXfUqL9m8V9WzvDanec/pcHnzdLi8eTpgXmHzpumQeY3Ne0wHzUs2L2qb194FGAA6iQfypDiKsQAAAABJRU5ErkJggg==) 0 0 no-repeat;background-size:100%;color:#333}.pro-info-title a{float:right;line-height:26px;font-weight:700;color:#333}.pro-info-title a span{display:inline-block;width:20px;height:20px;margin-right:5px;vertical-align:middle;background:url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACoAAAAnCAYAAAB5XdqFAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAA2hpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuMy1jMDExIDY2LjE0NTY2MSwgMjAxMi8wMi8wNi0xNDo1NjoyNyAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wTU09Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9tbS8iIHhtbG5zOnN0UmVmPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvc1R5cGUvUmVzb3VyY2VSZWYjIiB4bWxuczp4bXA9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC8iIHhtcE1NOk9yaWdpbmFsRG9jdW1lbnRJRD0ieG1wLmRpZDoyRTlBMjNFRkQ0MDhFNDExODc1MEYzQ0JFQURFQ0VCNyIgeG1wTU06RG9jdW1lbnRJRD0ieG1wLmRpZDoyQjc0QjE4NkZERkQxMUU0QTREQ0YxNzY5Q0UyRjA4MyIgeG1wTU06SW5zdGFuY2VJRD0ieG1wLmlpZDoyQjc0QjE4NUZERkQxMUU0QTREQ0YxNzY5Q0UyRjA4MyIgeG1wOkNyZWF0b3JUb29sPSJBZG9iZSBQaG90b3Nob3AgQ1M2IChNYWNpbnRvc2gpIj4gPHhtcE1NOkRlcml2ZWRGcm9tIHN0UmVmOmluc3RhbmNlSUQ9InhtcC5paWQ6MDU4MDExNzQwNzIwNjgxMTgyMkFGNjg2RTEzQzA3MjkiIHN0UmVmOmRvY3VtZW50SUQ9InhtcC5kaWQ6MkU5QTIzRUZENDA4RTQxMTg3NTBGM0NCRUFERUNFQjciLz4gPC9yZGY6RGVzY3JpcHRpb24+IDwvcmRmOlJERj4gPC94OnhtcG1ldGE+IDw/eHBhY2tldCBlbmQ9InIiPz4aEoG4AAAEUUlEQVR42sSYd2gUURDG77zYY8GSs8YaOwrmFAtYEKxYsBfsmKCgsYuKGFQIKoIF/4goothFFBUTREEUCxas2IiKDY1iSTQqJl78Br6Fcb3d2727JAM/2Ld3b/fbefPmzXvelJQUT4RWCbQGjUB1EAQF4BV4Cn55orDMzMx/2nEu+4uwCWAI6ATKW/yvCNwE2eAghUdl5Rz+ryc4Dx6B1SBgI9JwQDeQDh6DLLYjtnAeTQBbwPgQv8lQ54Bn4Cs/Oh60Ai2UE7xgIBgADoA08CmWQnuBI8Cv7hWCkxzOs+CbRd+aoB+YCIYDHwVPAn3BWHA5FkMvDzynRBaDPSAJjAbHbER66GH5zyh6+CCfIdaAzx4VrdBhFGXE4DvQH0wDLyMIr+f07GCQqzKGhMHQSIUm8+t9bN8HXemBaC2bz3rEdgW+q4NbofH8yipsP2acvfHEzl4xRnPYrgoOgYpuhK5kPBkxJsPy0RN7y+Wz89luz3c7EtoYLFD356uvLgmT0Vqs2otM2cVSaJpy/xWw18VLJe1sZ+zNcNFvJ7jFawm3eeGEyuyequ6tUanEiTUEc0CbcC8zmbxjrWrPVJM4pFCZMHXYfsFEHmmKK+ey72nwltd+LtW2Qg075tKb0dofrnSG9bcTGlDti57StwvqOmAnNEm175eB0HvquoVdUaLTwmubB1ZgiZdkul9FXSeykNGWB9bZLL9vTBPTUqhRQf1kzFjZILAijHdqgDEh7ku1P9eiz3d1XdlJmVeZoRC0+O9VxlNiiGcY936HWHJle3I4zJbGo5xlKVSWybqqUH5v8d8PXKfNlqiG9Qno6DJG/aby0HIy6dhpWwaTqbW6zrETelu1u5WBUJ3k79oJ1XlsRBkIHWaRU/8TmsVJINYFtCtFkS1BbWaFAhbXlkK/gOOqElru8mXvVBWU5bKvTOKjHPL9FGubnjaDcbyW/c02cN3hywo5EjXsZq2Fk6Qu3cGMcty2llRHOie4tRV7yJf/KKEh95qKH7/a+IUt0eapLXA77kR9JSByFngANoBqFP0hXCdfcnKyXpNlrR+pxDZlzRiMkch4HjwkMC0Jp5yMnLnQ3ccvNWwKJ4g/BiLrgTOmd8ppzA0n+Vt71LDz/OIubDcHk8Fnzk63hbVM2OmcA20sjn+mcsZfc3NSUsw90Eo15OLRXawdZzP3OUk9cxmPspGrpar6JayyjCwh+7ZNDIPa4WZ9KJMiZDdoYrpfxCG7wyObfOUdGYHOPHUxO+IZd6rGTqIZ69eAqSaWs69LboQa5d8ybqlrRhifsqhsZL42l3LizfU8S/AqR6zifAk63TXKg9NZzs3hrP3joF8R1+5U9s2wqDdlwVjIOuOTiusMTuS6Tj1qVcl3Z1nYiGnHwzz8lrF8y+VKZdS2cnDWw7RE94mLcCjzWEBkx3gxkEO03txjLWUo1AcDvcXFpbONT01NddtFjtK3ck814q8AAwBmN+66rcnZ9gAAAABJRU5ErkJggg==) 0 0 no-repeat;background-size:100%}.pro-info-text{overflow:hidden;line-height:20px;color:#666;margin-bottom:15px}.pro-info-text p{margin-bottom:5px}.pro-info-text img {vertical-align:top;width:100%}.pro-info-text .pro-ui-title{height:62px;margin-bottom:5px}.pro-info-text .pro-ui-title h5{float:left;width:40%;height:62px;line-height:62px;overflow:hidden;font-size:20px;font-weight:700;color:#333}.pro-info-text .pro-ui-title div{float:right;width:60%;overflow:hidden;border-bottom:2px solid #999}.pro-info-text .pro-ui-title div span{float:right;display:block;width:90px;height:60px}.pro-info-text .pro-dobule-images td{padding:1px}<\/style><\/head><body style='padding:10px;background:#fff'> <!-- <- 左侧body的style样式只为了此原型服务 --><br /><div class='pro-info-title'><h4>品牌故事<\/h4><\/div><div class='pro-info-text'><div class='pro-ui-title'><h5>SWAROVSKI <\/h5><div><span><img src='https://p10.ytrss.com/Brand/683/logo.jpg' width='100%' /><\/span><\/div><\/div><div class='pro-ui-text'><p>天鹅水晶标志是施华洛世奇的传统记号，也是施华洛世奇水晶精致优雅精神的象征。施华洛世奇公司产品的动人之处，不仅仅在于它的制品是多么巧妙地被打磨成数十个切面，以致其对光线有极好的折射能力，整个水晶制品看起来格外耀眼夺目，更在于施华洛世奇公司一直通过其产品向人们灌输着一种精致文化。\n<\/p><\/div><\/div><div class='pro-info-title'><h4>商品细节<\/h4><\/div><div class='pro-info-text'><table class='pro-dobule-images'><tr><td><img alt='Cottonshop' title='' src='https://p10.ytrss.com/product/21/468/5143/LargeImage/36514.jpg' width='100%' /><\/td><td><img alt='Cottonshop' title='' src='https://p10.ytrss.com/product/21/468/5143/LargeImage/13736.jpg' width='100%' /><\/td><\/tr><tr><td><img alt='Cottonshop' title='' src='https://p10.ytrss.com/product/21/468/5143/LargeImage/47072.jpg' width='100%' /><\/td><td><img alt='Cottonshop' title='' src='https://p10.ytrss.com/product/21/468/5143/LargeImage/28935.jpg' width='100%' /><\/td><\/tr><tr><td><img alt='Cottonshop' title='' src='https://p10.ytrss.com/product/21/468/5143/LargeImage/791.jpg' width='100%' /><\/td><td><\/td><\/tr><\/table><\/div><\/body><\/html>","productparameterhtml":"<!DOCTYPE html><html><head><title>银泰网 - 银泰百货连锁在线购物中心，银泰商业集团官方购物网站<\/title><meta charset='utf-8' /><meta name='viewport' content='initial-scale=1, maximum-scale=1, minimum-scale=1, width=device-width, user-scalable=no' /><meta content='yes' name='apple-mobile-web-app-capable' /><meta content='black' name='apple-mobile-web-app-status-bar-style' /><meta content='telephone=no' name='format-detection' /><meta name='keywords' content='银泰网' /><meta name='description' content='银泰网（www.yintai.com）作为银泰商业集团官方购物网站,专注经营精品时尚百货类，包括女装，男装，鞋靴，化妆品，运动系列，时尚配饰，名品箱包等万种百货商品，100%正品，15天免费退换货。银泰网作为银泰百货连锁在线购物中心，致力打造成为中国最卓越的百货购物网站！' /><link href='https://r.ytrss.com/mobile/css/style.css' rel='stylesheet'  type='text/css'><style type='text/css'>.pro-info-size{width:100%;border:1px solid #ddd;border-collapse:collapse;border-spacing:0;font-size:14px;margin-bottom:15px}.pro-info-size td{width:50%;border:1px solid #ddd;padding:10px 5px;color:#666}.pro-info-size td b{color:#333}.pro-info-title{margin:0 auto 6px;height:26px}.pro-info-title h4{float:left;width:90px;height:26px;line-height:26px;text-indent:10px;font-size:14px;font-weight:700;background:url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAJ4AAAAyCAMAAACahZLcAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAyBpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuMC1jMDYwIDYxLjEzNDc3NywgMjAxMC8wMi8xMi0xNzozMjowMCAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvIiB4bWxuczp4bXBNTT0iaHR0cDovL25zLmFkb2JlLmNvbS94YXAvMS4wL21tLyIgeG1sbnM6c3RSZWY9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9zVHlwZS9SZXNvdXJjZVJlZiMiIHhtcDpDcmVhdG9yVG9vbD0iQWRvYmUgUGhvdG9zaG9wIENTNSBXaW5kb3dzIiB4bXBNTTpJbnN0YW5jZUlEPSJ4bXAuaWlkOjYxNTAwM0I0MEY1OTExRTU4M0MxOEI5QjQ4MzlEMDM4IiB4bXBNTTpEb2N1bWVudElEPSJ4bXAuZGlkOjYxNTAwM0I1MEY1OTExRTU4M0MxOEI5QjQ4MzlEMDM4Ij4gPHhtcE1NOkRlcml2ZWRGcm9tIHN0UmVmOmluc3RhbmNlSUQ9InhtcC5paWQ6NjE1MDAzQjIwRjU5MTFFNTgzQzE4QjlCNDgzOUQwMzgiIHN0UmVmOmRvY3VtZW50SUQ9InhtcC5kaWQ6NjE1MDAzQjMwRjU5MTFFNTgzQzE4QjlCNDgzOUQwMzgiLz4gPC9yZGY6RGVzY3JpcHRpb24+IDwvcmRmOlJERj4gPC94OnhtcG1ldGE+IDw/eHBhY2tldCBlbmQ9InIiPz7mwj00AAAARVBMVEXq6ur////c3Nz+/v7s7Ozu7u7r6+v29vb9/f34+Pj19fX7+/v5+fnt7e339/fv7+/w8PDy8vL8/Pzz8/Px8fH09PT6+vp3BjvhAAAAyklEQVR42szXSRKCQBBFwUJoRAUBQe9/VAUHwHBv1gkyevNfx26+bLr4392y3xcGr7N5cbJ5o82Li83rbV5UNm+weWVF8+Jq88qc5sXR5hU5zYu9zWtsXpxtXrJ5cbB5yeZFbfM6m/dV9RxvtHnb5/N4vc3bfIpA3mDz1lUP8tZVL/JWVS/yVlVP8paqJ3lL1Zu8wuZ9qh7lNTbvXfUqL9m8V9WzvDanec/pcHnzdLi8eTpgXmHzpumQeY3Ne0wHzUs2L2qb194FGAA6iQfypDiKsQAAAABJRU5ErkJggg==) 0 0 no-repeat;background-size:100%;color:#333}.pro-info-title a{float:right;line-height:26px;font-weight:700;color:#333}.pro-info-title a span{display:inline-block;width:20px;height:20px;margin-right:5px;vertical-align:middle;background:url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACoAAAAnCAYAAAB5XdqFAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAA2hpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuMy1jMDExIDY2LjE0NTY2MSwgMjAxMi8wMi8wNi0xNDo1NjoyNyAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wTU09Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9tbS8iIHhtbG5zOnN0UmVmPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvc1R5cGUvUmVzb3VyY2VSZWYjIiB4bWxuczp4bXA9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC8iIHhtcE1NOk9yaWdpbmFsRG9jdW1lbnRJRD0ieG1wLmRpZDoyRTlBMjNFRkQ0MDhFNDExODc1MEYzQ0JFQURFQ0VCNyIgeG1wTU06RG9jdW1lbnRJRD0ieG1wLmRpZDoyQjc0QjE4NkZERkQxMUU0QTREQ0YxNzY5Q0UyRjA4MyIgeG1wTU06SW5zdGFuY2VJRD0ieG1wLmlpZDoyQjc0QjE4NUZERkQxMUU0QTREQ0YxNzY5Q0UyRjA4MyIgeG1wOkNyZWF0b3JUb29sPSJBZG9iZSBQaG90b3Nob3AgQ1M2IChNYWNpbnRvc2gpIj4gPHhtcE1NOkRlcml2ZWRGcm9tIHN0UmVmOmluc3RhbmNlSUQ9InhtcC5paWQ6MDU4MDExNzQwNzIwNjgxMTgyMkFGNjg2RTEzQzA3MjkiIHN0UmVmOmRvY3VtZW50SUQ9InhtcC5kaWQ6MkU5QTIzRUZENDA4RTQxMTg3NTBGM0NCRUFERUNFQjciLz4gPC9yZGY6RGVzY3JpcHRpb24+IDwvcmRmOlJERj4gPC94OnhtcG1ldGE+IDw/eHBhY2tldCBlbmQ9InIiPz4aEoG4AAAEUUlEQVR42sSYd2gUURDG77zYY8GSs8YaOwrmFAtYEKxYsBfsmKCgsYuKGFQIKoIF/4goothFFBUTREEUCxas2IiKDY1iSTQqJl78Br6Fcb3d2727JAM/2Ld3b/fbefPmzXvelJQUT4RWCbQGjUB1EAQF4BV4Cn55orDMzMx/2nEu+4uwCWAI6ATKW/yvCNwE2eAghUdl5Rz+ryc4Dx6B1SBgI9JwQDeQDh6DLLYjtnAeTQBbwPgQv8lQ54Bn4Cs/Oh60Ai2UE7xgIBgADoA08CmWQnuBI8Cv7hWCkxzOs+CbRd+aoB+YCIYDHwVPAn3BWHA5FkMvDzynRBaDPSAJjAbHbER66GH5zyh6+CCfIdaAzx4VrdBhFGXE4DvQH0wDLyMIr+f07GCQqzKGhMHQSIUm8+t9bN8HXemBaC2bz3rEdgW+q4NbofH8yipsP2acvfHEzl4xRnPYrgoOgYpuhK5kPBkxJsPy0RN7y+Wz89luz3c7EtoYLFD356uvLgmT0Vqs2otM2cVSaJpy/xWw18VLJe1sZ+zNcNFvJ7jFawm3eeGEyuyequ6tUanEiTUEc0CbcC8zmbxjrWrPVJM4pFCZMHXYfsFEHmmKK+ey72nwltd+LtW2Qg075tKb0dofrnSG9bcTGlDti57StwvqOmAnNEm175eB0HvquoVdUaLTwmubB1ZgiZdkul9FXSeykNGWB9bZLL9vTBPTUqhRQf1kzFjZILAijHdqgDEh7ku1P9eiz3d1XdlJmVeZoRC0+O9VxlNiiGcY936HWHJle3I4zJbGo5xlKVSWybqqUH5v8d8PXKfNlqiG9Qno6DJG/aby0HIy6dhpWwaTqbW6zrETelu1u5WBUJ3k79oJ1XlsRBkIHWaRU/8TmsVJINYFtCtFkS1BbWaFAhbXlkK/gOOqElru8mXvVBWU5bKvTOKjHPL9FGubnjaDcbyW/c02cN3hywo5EjXsZq2Fk6Qu3cGMcty2llRHOie4tRV7yJf/KKEh95qKH7/a+IUt0eapLXA77kR9JSByFngANoBqFP0hXCdfcnKyXpNlrR+pxDZlzRiMkch4HjwkMC0Jp5yMnLnQ3ccvNWwKJ4g/BiLrgTOmd8ppzA0n+Vt71LDz/OIubDcHk8Fnzk63hbVM2OmcA20sjn+mcsZfc3NSUsw90Eo15OLRXawdZzP3OUk9cxmPspGrpar6JayyjCwh+7ZNDIPa4WZ9KJMiZDdoYrpfxCG7wyObfOUdGYHOPHUxO+IZd6rGTqIZ69eAqSaWs69LboQa5d8ybqlrRhifsqhsZL42l3LizfU8S/AqR6zifAk63TXKg9NZzs3hrP3joF8R1+5U9s2wqDdlwVjIOuOTiusMTuS6Tj1qVcl3Z1nYiGnHwzz8lrF8y+VKZdS2cnDWw7RE94mLcCjzWEBkx3gxkEO03txjLWUo1AcDvcXFpbONT01NddtFjtK3ck814q8AAwBmN+66rcnZ9gAAAABJRU5ErkJggg==) 0 0 no-repeat;background-size:100%}.pro-info-text{overflow:hidden;line-height:20px;color:#666;margin-bottom:15px}.pro-info-text p{margin-bottom:5px}.pro-info-text img {vertical-align:top;width:100%}.pro-info-text .pro-ui-title{height:62px;margin-bottom:5px}.pro-info-text .pro-ui-title h5{float:left;width:40%;height:62px;line-height:62px;overflow:hidden;font-size:20px;font-weight:700;color:#333}.pro-info-text .pro-ui-title div{float:right;width:60%;overflow:hidden;border-bottom:2px solid #999}.pro-info-text .pro-ui-title div span{float:right;display:block;width:90px;height:60px}.pro-info-text .pro-dobule-images td{padding:1px}<\/style><\/head><body style='padding:10px;background:#fff'> <!-- <- 左侧body的style样式只为了此原型服务 --><br /><div class='pro-info-title'><h4>商品属性<\/h4><\/div><table class='pro-info-size'><\/table><\/body><\/html>","brandlogo":"https://p10.ytrss.com/Brand/683/logo.jpg","seckillid":0,"ismiaowgoods":false,"isowntake":false,"miaowdescription":"","itemcode":"21-468-5143","name":"SWAROVSKI/施华洛世奇水晶小挂件情人节礼物金色5064267全球联保","price":330,"yt_price":280,"score":0,"producttype":"3","instock":true,"promotions":[{"name":"特卖","desc":["名品配饰特卖"],"promotionid":"P=27002","isgoto":true}],"brand":"SWAROVSKI ","small_img_urls":["https://p10.ytrss.com/product/21/468/5143/LargeImage/36514.jpg","https://p10.ytrss.com/product/21/468/5143/LargeImage/13736.jpg","https://p10.ytrss.com/product/21/468/5143/LargeImage/47072.jpg","https://p10.ytrss.com/product/21/468/5143/LargeImage/28935.jpg","https://p10.ytrss.com/product/21/468/5143/LargeImage/791.jpg"],"large_img_urls":["https://p10.ytrss.com/product/21/468/5143/ZoomImage/36514.jpg","https://p10.ytrss.com/product/21/468/5143/ZoomImage/13736.jpg","https://p10.ytrss.com/product/21/468/5143/ZoomImage/47072.jpg","https://p10.ytrss.com/product/21/468/5143/ZoomImage/28935.jpg","https://p10.ytrss.com/product/21/468/5143/ZoomImage/791.jpg"],"sku_property":[{"url":"https://p10.ytrss.com/product/21/468/5143/ViewImage/36514.jpg","name":"颜色分类","value":"金色"},{"url":null,"name":"尺寸","value":"4.8*3.9*0.6cm"}],"property_detail":{"properties":[],"property_descriptions":[{"name":"品牌故事","description":"天鹅水晶标志是施华洛世奇的传统记号，也是施华洛世奇水晶精致优雅精神的象征。施华洛世奇公司产品的动人之处，不仅仅在于它的制品是多么巧妙地被打磨成数十个切面，以致其对光线有极好的折射能力，整个水晶制品看起来格外耀眼夺目，更在于施华洛世奇公司一直通过其产品向人们灌输着一种精致文化。\n"}]},"imageurllist":[],"gift":null,"weburl":"https://m.yintai.com/Sales/ProductDetail?itemCode=21-468-5143","isfavorite":false,"remain":387777,"endtime":null,"leftcount":2,"leftsecond":"387777.6545752","isshowfitting":0,"discount":8.5,"imageitemcode":"21-468-5143","notice":null},"commendlist":[],"brandrecommand":[]}
     */

    private boolean isSuccessful;
    private int statusCode;
    private String description;
    private String userId;
    private DataBean data;

    public boolean isIsSuccessful() {
        return isSuccessful;
    }

    public void setIsSuccessful(boolean isSuccessful) {
        this.isSuccessful = isSuccessful;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * announcement : null
         * product_list : []
         * current : {"brandid":683,"longname":"SWAROVSKI/施华洛世奇水晶小挂件情人节礼物金色5064267全球联保","finalprice":280,"airrate":0,"ppatr":"0%","ppata":0,"description":"","isshowdetail":0,"productdetailhtml":"<!DOCTYPE html><html><head><title>银泰网 - 银泰百货连锁在线购物中心，银泰商业集团官方购物网站<\/title><meta charset='utf-8' /><meta name='viewport' content='initial-scale=1, maximum-scale=1, minimum-scale=1, width=device-width, user-scalable=no' /><meta content='yes' name='apple-mobile-web-app-capable' /><meta content='black' name='apple-mobile-web-app-status-bar-style' /><meta content='telephone=no' name='format-detection' /><meta name='keywords' content='银泰网' /><meta name='description' content='银泰网（www.yintai.com）作为银泰商业集团官方购物网站,专注经营精品时尚百货类，包括女装，男装，鞋靴，化妆品，运动系列，时尚配饰，名品箱包等万种百货商品，100%正品，15天免费退换货。银泰网作为银泰百货连锁在线购物中心，致力打造成为中国最卓越的百货购物网站！' /><link href='https://r.ytrss.com/mobile/css/style.css' rel='stylesheet'  type='text/css'><style type='text/css'>.pro-info-size{width:100%;border:1px solid #ddd;border-collapse:collapse;border-spacing:0;font-size:14px;margin-bottom:15px}.pro-info-size td{width:50%;border:1px solid #ddd;padding:10px 5px;color:#666}.pro-info-size td b{color:#333}.pro-info-title{margin:0 auto 6px;height:26px}.pro-info-title h4{float:left;width:90px;height:26px;line-height:26px;text-indent:10px;font-size:14px;font-weight:700;background:url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAJ4AAAAyCAMAAACahZLcAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAyBpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuMC1jMDYwIDYxLjEzNDc3NywgMjAxMC8wMi8xMi0xNzozMjowMCAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvIiB4bWxuczp4bXBNTT0iaHR0cDovL25zLmFkb2JlLmNvbS94YXAvMS4wL21tLyIgeG1sbnM6c3RSZWY9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9zVHlwZS9SZXNvdXJjZVJlZiMiIHhtcDpDcmVhdG9yVG9vbD0iQWRvYmUgUGhvdG9zaG9wIENTNSBXaW5kb3dzIiB4bXBNTTpJbnN0YW5jZUlEPSJ4bXAuaWlkOjYxNTAwM0I0MEY1OTExRTU4M0MxOEI5QjQ4MzlEMDM4IiB4bXBNTTpEb2N1bWVudElEPSJ4bXAuZGlkOjYxNTAwM0I1MEY1OTExRTU4M0MxOEI5QjQ4MzlEMDM4Ij4gPHhtcE1NOkRlcml2ZWRGcm9tIHN0UmVmOmluc3RhbmNlSUQ9InhtcC5paWQ6NjE1MDAzQjIwRjU5MTFFNTgzQzE4QjlCNDgzOUQwMzgiIHN0UmVmOmRvY3VtZW50SUQ9InhtcC5kaWQ6NjE1MDAzQjMwRjU5MTFFNTgzQzE4QjlCNDgzOUQwMzgiLz4gPC9yZGY6RGVzY3JpcHRpb24+IDwvcmRmOlJERj4gPC94OnhtcG1ldGE+IDw/eHBhY2tldCBlbmQ9InIiPz7mwj00AAAARVBMVEXq6ur////c3Nz+/v7s7Ozu7u7r6+v29vb9/f34+Pj19fX7+/v5+fnt7e339/fv7+/w8PDy8vL8/Pzz8/Px8fH09PT6+vp3BjvhAAAAyklEQVR42szXSRKCQBBFwUJoRAUBQe9/VAUHwHBv1gkyevNfx26+bLr4392y3xcGr7N5cbJ5o82Li83rbV5UNm+weWVF8+Jq88qc5sXR5hU5zYu9zWtsXpxtXrJ5cbB5yeZFbfM6m/dV9RxvtHnb5/N4vc3bfIpA3mDz1lUP8tZVL/JWVS/yVlVP8paqJ3lL1Zu8wuZ9qh7lNTbvXfUqL9m8V9WzvDanec/pcHnzdLi8eTpgXmHzpumQeY3Ne0wHzUs2L2qb194FGAA6iQfypDiKsQAAAABJRU5ErkJggg==) 0 0 no-repeat;background-size:100%;color:#333}.pro-info-title a{float:right;line-height:26px;font-weight:700;color:#333}.pro-info-title a span{display:inline-block;width:20px;height:20px;margin-right:5px;vertical-align:middle;background:url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACoAAAAnCAYAAAB5XdqFAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAA2hpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuMy1jMDExIDY2LjE0NTY2MSwgMjAxMi8wMi8wNi0xNDo1NjoyNyAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wTU09Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9tbS8iIHhtbG5zOnN0UmVmPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvc1R5cGUvUmVzb3VyY2VSZWYjIiB4bWxuczp4bXA9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC8iIHhtcE1NOk9yaWdpbmFsRG9jdW1lbnRJRD0ieG1wLmRpZDoyRTlBMjNFRkQ0MDhFNDExODc1MEYzQ0JFQURFQ0VCNyIgeG1wTU06RG9jdW1lbnRJRD0ieG1wLmRpZDoyQjc0QjE4NkZERkQxMUU0QTREQ0YxNzY5Q0UyRjA4MyIgeG1wTU06SW5zdGFuY2VJRD0ieG1wLmlpZDoyQjc0QjE4NUZERkQxMUU0QTREQ0YxNzY5Q0UyRjA4MyIgeG1wOkNyZWF0b3JUb29sPSJBZG9iZSBQaG90b3Nob3AgQ1M2IChNYWNpbnRvc2gpIj4gPHhtcE1NOkRlcml2ZWRGcm9tIHN0UmVmOmluc3RhbmNlSUQ9InhtcC5paWQ6MDU4MDExNzQwNzIwNjgxMTgyMkFGNjg2RTEzQzA3MjkiIHN0UmVmOmRvY3VtZW50SUQ9InhtcC5kaWQ6MkU5QTIzRUZENDA4RTQxMTg3NTBGM0NCRUFERUNFQjciLz4gPC9yZGY6RGVzY3JpcHRpb24+IDwvcmRmOlJERj4gPC94OnhtcG1ldGE+IDw/eHBhY2tldCBlbmQ9InIiPz4aEoG4AAAEUUlEQVR42sSYd2gUURDG77zYY8GSs8YaOwrmFAtYEKxYsBfsmKCgsYuKGFQIKoIF/4goothFFBUTREEUCxas2IiKDY1iSTQqJl78Br6Fcb3d2727JAM/2Ld3b/fbefPmzXvelJQUT4RWCbQGjUB1EAQF4BV4Cn55orDMzMx/2nEu+4uwCWAI6ATKW/yvCNwE2eAghUdl5Rz+ryc4Dx6B1SBgI9JwQDeQDh6DLLYjtnAeTQBbwPgQv8lQ54Bn4Cs/Oh60Ai2UE7xgIBgADoA08CmWQnuBI8Cv7hWCkxzOs+CbRd+aoB+YCIYDHwVPAn3BWHA5FkMvDzynRBaDPSAJjAbHbER66GH5zyh6+CCfIdaAzx4VrdBhFGXE4DvQH0wDLyMIr+f07GCQqzKGhMHQSIUm8+t9bN8HXemBaC2bz3rEdgW+q4NbofH8yipsP2acvfHEzl4xRnPYrgoOgYpuhK5kPBkxJsPy0RN7y+Wz89luz3c7EtoYLFD356uvLgmT0Vqs2otM2cVSaJpy/xWw18VLJe1sZ+zNcNFvJ7jFawm3eeGEyuyequ6tUanEiTUEc0CbcC8zmbxjrWrPVJM4pFCZMHXYfsFEHmmKK+ey72nwltd+LtW2Qg075tKb0dofrnSG9bcTGlDti57StwvqOmAnNEm175eB0HvquoVdUaLTwmubB1ZgiZdkul9FXSeykNGWB9bZLL9vTBPTUqhRQf1kzFjZILAijHdqgDEh7ku1P9eiz3d1XdlJmVeZoRC0+O9VxlNiiGcY936HWHJle3I4zJbGo5xlKVSWybqqUH5v8d8PXKfNlqiG9Qno6DJG/aby0HIy6dhpWwaTqbW6zrETelu1u5WBUJ3k79oJ1XlsRBkIHWaRU/8TmsVJINYFtCtFkS1BbWaFAhbXlkK/gOOqElru8mXvVBWU5bKvTOKjHPL9FGubnjaDcbyW/c02cN3hywo5EjXsZq2Fk6Qu3cGMcty2llRHOie4tRV7yJf/KKEh95qKH7/a+IUt0eapLXA77kR9JSByFngANoBqFP0hXCdfcnKyXpNlrR+pxDZlzRiMkch4HjwkMC0Jp5yMnLnQ3ccvNWwKJ4g/BiLrgTOmd8ppzA0n+Vt71LDz/OIubDcHk8Fnzk63hbVM2OmcA20sjn+mcsZfc3NSUsw90Eo15OLRXawdZzP3OUk9cxmPspGrpar6JayyjCwh+7ZNDIPa4WZ9KJMiZDdoYrpfxCG7wyObfOUdGYHOPHUxO+IZd6rGTqIZ69eAqSaWs69LboQa5d8ybqlrRhifsqhsZL42l3LizfU8S/AqR6zifAk63TXKg9NZzs3hrP3joF8R1+5U9s2wqDdlwVjIOuOTiusMTuS6Tj1qVcl3Z1nYiGnHwzz8lrF8y+VKZdS2cnDWw7RE94mLcCjzWEBkx3gxkEO03txjLWUo1AcDvcXFpbONT01NddtFjtK3ck814q8AAwBmN+66rcnZ9gAAAABJRU5ErkJggg==) 0 0 no-repeat;background-size:100%}.pro-info-text{overflow:hidden;line-height:20px;color:#666;margin-bottom:15px}.pro-info-text p{margin-bottom:5px}.pro-info-text img {vertical-align:top;width:100%}.pro-info-text .pro-ui-title{height:62px;margin-bottom:5px}.pro-info-text .pro-ui-title h5{float:left;width:40%;height:62px;line-height:62px;overflow:hidden;font-size:20px;font-weight:700;color:#333}.pro-info-text .pro-ui-title div{float:right;width:60%;overflow:hidden;border-bottom:2px solid #999}.pro-info-text .pro-ui-title div span{float:right;display:block;width:90px;height:60px}.pro-info-text .pro-dobule-images td{padding:1px}<\/style><\/head><body style='padding:10px;background:#fff'> <!-- <- 左侧body的style样式只为了此原型服务 --><br /><div class='pro-info-title'><h4>品牌故事<\/h4><\/div><div class='pro-info-text'><div class='pro-ui-title'><h5>SWAROVSKI <\/h5><div><span><img src='https://p10.ytrss.com/Brand/683/logo.jpg' width='100%' /><\/span><\/div><\/div><div class='pro-ui-text'><p>天鹅水晶标志是施华洛世奇的传统记号，也是施华洛世奇水晶精致优雅精神的象征。施华洛世奇公司产品的动人之处，不仅仅在于它的制品是多么巧妙地被打磨成数十个切面，以致其对光线有极好的折射能力，整个水晶制品看起来格外耀眼夺目，更在于施华洛世奇公司一直通过其产品向人们灌输着一种精致文化。\n<\/p><\/div><\/div><div class='pro-info-title'><h4>商品细节<\/h4><\/div><div class='pro-info-text'><table class='pro-dobule-images'><tr><td><img alt='Cottonshop' title='' src='https://p10.ytrss.com/product/21/468/5143/LargeImage/36514.jpg' width='100%' /><\/td><td><img alt='Cottonshop' title='' src='https://p10.ytrss.com/product/21/468/5143/LargeImage/13736.jpg' width='100%' /><\/td><\/tr><tr><td><img alt='Cottonshop' title='' src='https://p10.ytrss.com/product/21/468/5143/LargeImage/47072.jpg' width='100%' /><\/td><td><img alt='Cottonshop' title='' src='https://p10.ytrss.com/product/21/468/5143/LargeImage/28935.jpg' width='100%' /><\/td><\/tr><tr><td><img alt='Cottonshop' title='' src='https://p10.ytrss.com/product/21/468/5143/LargeImage/791.jpg' width='100%' /><\/td><td><\/td><\/tr><\/table><\/div><\/body><\/html>","productparameterhtml":"<!DOCTYPE html><html><head><title>银泰网 - 银泰百货连锁在线购物中心，银泰商业集团官方购物网站<\/title><meta charset='utf-8' /><meta name='viewport' content='initial-scale=1, maximum-scale=1, minimum-scale=1, width=device-width, user-scalable=no' /><meta content='yes' name='apple-mobile-web-app-capable' /><meta content='black' name='apple-mobile-web-app-status-bar-style' /><meta content='telephone=no' name='format-detection' /><meta name='keywords' content='银泰网' /><meta name='description' content='银泰网（www.yintai.com）作为银泰商业集团官方购物网站,专注经营精品时尚百货类，包括女装，男装，鞋靴，化妆品，运动系列，时尚配饰，名品箱包等万种百货商品，100%正品，15天免费退换货。银泰网作为银泰百货连锁在线购物中心，致力打造成为中国最卓越的百货购物网站！' /><link href='https://r.ytrss.com/mobile/css/style.css' rel='stylesheet'  type='text/css'><style type='text/css'>.pro-info-size{width:100%;border:1px solid #ddd;border-collapse:collapse;border-spacing:0;font-size:14px;margin-bottom:15px}.pro-info-size td{width:50%;border:1px solid #ddd;padding:10px 5px;color:#666}.pro-info-size td b{color:#333}.pro-info-title{margin:0 auto 6px;height:26px}.pro-info-title h4{float:left;width:90px;height:26px;line-height:26px;text-indent:10px;font-size:14px;font-weight:700;background:url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAJ4AAAAyCAMAAACahZLcAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAyBpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuMC1jMDYwIDYxLjEzNDc3NywgMjAxMC8wMi8xMi0xNzozMjowMCAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvIiB4bWxuczp4bXBNTT0iaHR0cDovL25zLmFkb2JlLmNvbS94YXAvMS4wL21tLyIgeG1sbnM6c3RSZWY9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9zVHlwZS9SZXNvdXJjZVJlZiMiIHhtcDpDcmVhdG9yVG9vbD0iQWRvYmUgUGhvdG9zaG9wIENTNSBXaW5kb3dzIiB4bXBNTTpJbnN0YW5jZUlEPSJ4bXAuaWlkOjYxNTAwM0I0MEY1OTExRTU4M0MxOEI5QjQ4MzlEMDM4IiB4bXBNTTpEb2N1bWVudElEPSJ4bXAuZGlkOjYxNTAwM0I1MEY1OTExRTU4M0MxOEI5QjQ4MzlEMDM4Ij4gPHhtcE1NOkRlcml2ZWRGcm9tIHN0UmVmOmluc3RhbmNlSUQ9InhtcC5paWQ6NjE1MDAzQjIwRjU5MTFFNTgzQzE4QjlCNDgzOUQwMzgiIHN0UmVmOmRvY3VtZW50SUQ9InhtcC5kaWQ6NjE1MDAzQjMwRjU5MTFFNTgzQzE4QjlCNDgzOUQwMzgiLz4gPC9yZGY6RGVzY3JpcHRpb24+IDwvcmRmOlJERj4gPC94OnhtcG1ldGE+IDw/eHBhY2tldCBlbmQ9InIiPz7mwj00AAAARVBMVEXq6ur////c3Nz+/v7s7Ozu7u7r6+v29vb9/f34+Pj19fX7+/v5+fnt7e339/fv7+/w8PDy8vL8/Pzz8/Px8fH09PT6+vp3BjvhAAAAyklEQVR42szXSRKCQBBFwUJoRAUBQe9/VAUHwHBv1gkyevNfx26+bLr4392y3xcGr7N5cbJ5o82Li83rbV5UNm+weWVF8+Jq88qc5sXR5hU5zYu9zWtsXpxtXrJ5cbB5yeZFbfM6m/dV9RxvtHnb5/N4vc3bfIpA3mDz1lUP8tZVL/JWVS/yVlVP8paqJ3lL1Zu8wuZ9qh7lNTbvXfUqL9m8V9WzvDanec/pcHnzdLi8eTpgXmHzpumQeY3Ne0wHzUs2L2qb194FGAA6iQfypDiKsQAAAABJRU5ErkJggg==) 0 0 no-repeat;background-size:100%;color:#333}.pro-info-title a{float:right;line-height:26px;font-weight:700;color:#333}.pro-info-title a span{display:inline-block;width:20px;height:20px;margin-right:5px;vertical-align:middle;background:url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACoAAAAnCAYAAAB5XdqFAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAA2hpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuMy1jMDExIDY2LjE0NTY2MSwgMjAxMi8wMi8wNi0xNDo1NjoyNyAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wTU09Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9tbS8iIHhtbG5zOnN0UmVmPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvc1R5cGUvUmVzb3VyY2VSZWYjIiB4bWxuczp4bXA9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC8iIHhtcE1NOk9yaWdpbmFsRG9jdW1lbnRJRD0ieG1wLmRpZDoyRTlBMjNFRkQ0MDhFNDExODc1MEYzQ0JFQURFQ0VCNyIgeG1wTU06RG9jdW1lbnRJRD0ieG1wLmRpZDoyQjc0QjE4NkZERkQxMUU0QTREQ0YxNzY5Q0UyRjA4MyIgeG1wTU06SW5zdGFuY2VJRD0ieG1wLmlpZDoyQjc0QjE4NUZERkQxMUU0QTREQ0YxNzY5Q0UyRjA4MyIgeG1wOkNyZWF0b3JUb29sPSJBZG9iZSBQaG90b3Nob3AgQ1M2IChNYWNpbnRvc2gpIj4gPHhtcE1NOkRlcml2ZWRGcm9tIHN0UmVmOmluc3RhbmNlSUQ9InhtcC5paWQ6MDU4MDExNzQwNzIwNjgxMTgyMkFGNjg2RTEzQzA3MjkiIHN0UmVmOmRvY3VtZW50SUQ9InhtcC5kaWQ6MkU5QTIzRUZENDA4RTQxMTg3NTBGM0NCRUFERUNFQjciLz4gPC9yZGY6RGVzY3JpcHRpb24+IDwvcmRmOlJERj4gPC94OnhtcG1ldGE+IDw/eHBhY2tldCBlbmQ9InIiPz4aEoG4AAAEUUlEQVR42sSYd2gUURDG77zYY8GSs8YaOwrmFAtYEKxYsBfsmKCgsYuKGFQIKoIF/4goothFFBUTREEUCxas2IiKDY1iSTQqJl78Br6Fcb3d2727JAM/2Ld3b/fbefPmzXvelJQUT4RWCbQGjUB1EAQF4BV4Cn55orDMzMx/2nEu+4uwCWAI6ATKW/yvCNwE2eAghUdl5Rz+ryc4Dx6B1SBgI9JwQDeQDh6DLLYjtnAeTQBbwPgQv8lQ54Bn4Cs/Oh60Ai2UE7xgIBgADoA08CmWQnuBI8Cv7hWCkxzOs+CbRd+aoB+YCIYDHwVPAn3BWHA5FkMvDzynRBaDPSAJjAbHbER66GH5zyh6+CCfIdaAzx4VrdBhFGXE4DvQH0wDLyMIr+f07GCQqzKGhMHQSIUm8+t9bN8HXemBaC2bz3rEdgW+q4NbofH8yipsP2acvfHEzl4xRnPYrgoOgYpuhK5kPBkxJsPy0RN7y+Wz89luz3c7EtoYLFD356uvLgmT0Vqs2otM2cVSaJpy/xWw18VLJe1sZ+zNcNFvJ7jFawm3eeGEyuyequ6tUanEiTUEc0CbcC8zmbxjrWrPVJM4pFCZMHXYfsFEHmmKK+ey72nwltd+LtW2Qg075tKb0dofrnSG9bcTGlDti57StwvqOmAnNEm175eB0HvquoVdUaLTwmubB1ZgiZdkul9FXSeykNGWB9bZLL9vTBPTUqhRQf1kzFjZILAijHdqgDEh7ku1P9eiz3d1XdlJmVeZoRC0+O9VxlNiiGcY936HWHJle3I4zJbGo5xlKVSWybqqUH5v8d8PXKfNlqiG9Qno6DJG/aby0HIy6dhpWwaTqbW6zrETelu1u5WBUJ3k79oJ1XlsRBkIHWaRU/8TmsVJINYFtCtFkS1BbWaFAhbXlkK/gOOqElru8mXvVBWU5bKvTOKjHPL9FGubnjaDcbyW/c02cN3hywo5EjXsZq2Fk6Qu3cGMcty2llRHOie4tRV7yJf/KKEh95qKH7/a+IUt0eapLXA77kR9JSByFngANoBqFP0hXCdfcnKyXpNlrR+pxDZlzRiMkch4HjwkMC0Jp5yMnLnQ3ccvNWwKJ4g/BiLrgTOmd8ppzA0n+Vt71LDz/OIubDcHk8Fnzk63hbVM2OmcA20sjn+mcsZfc3NSUsw90Eo15OLRXawdZzP3OUk9cxmPspGrpar6JayyjCwh+7ZNDIPa4WZ9KJMiZDdoYrpfxCG7wyObfOUdGYHOPHUxO+IZd6rGTqIZ69eAqSaWs69LboQa5d8ybqlrRhifsqhsZL42l3LizfU8S/AqR6zifAk63TXKg9NZzs3hrP3joF8R1+5U9s2wqDdlwVjIOuOTiusMTuS6Tj1qVcl3Z1nYiGnHwzz8lrF8y+VKZdS2cnDWw7RE94mLcCjzWEBkx3gxkEO03txjLWUo1AcDvcXFpbONT01NddtFjtK3ck814q8AAwBmN+66rcnZ9gAAAABJRU5ErkJggg==) 0 0 no-repeat;background-size:100%}.pro-info-text{overflow:hidden;line-height:20px;color:#666;margin-bottom:15px}.pro-info-text p{margin-bottom:5px}.pro-info-text img {vertical-align:top;width:100%}.pro-info-text .pro-ui-title{height:62px;margin-bottom:5px}.pro-info-text .pro-ui-title h5{float:left;width:40%;height:62px;line-height:62px;overflow:hidden;font-size:20px;font-weight:700;color:#333}.pro-info-text .pro-ui-title div{float:right;width:60%;overflow:hidden;border-bottom:2px solid #999}.pro-info-text .pro-ui-title div span{float:right;display:block;width:90px;height:60px}.pro-info-text .pro-dobule-images td{padding:1px}<\/style><\/head><body style='padding:10px;background:#fff'> <!-- <- 左侧body的style样式只为了此原型服务 --><br /><div class='pro-info-title'><h4>商品属性<\/h4><\/div><table class='pro-info-size'><\/table><\/body><\/html>","brandlogo":"https://p10.ytrss.com/Brand/683/logo.jpg","seckillid":0,"ismiaowgoods":false,"isowntake":false,"miaowdescription":"","itemcode":"21-468-5143","name":"SWAROVSKI/施华洛世奇水晶小挂件情人节礼物金色5064267全球联保","price":330,"yt_price":280,"score":0,"producttype":"3","instock":true,"promotions":[{"name":"特卖","desc":["名品配饰特卖"],"promotionid":"P=27002","isgoto":true}],"brand":"SWAROVSKI ","small_img_urls":["https://p10.ytrss.com/product/21/468/5143/LargeImage/36514.jpg","https://p10.ytrss.com/product/21/468/5143/LargeImage/13736.jpg","https://p10.ytrss.com/product/21/468/5143/LargeImage/47072.jpg","https://p10.ytrss.com/product/21/468/5143/LargeImage/28935.jpg","https://p10.ytrss.com/product/21/468/5143/LargeImage/791.jpg"],"large_img_urls":["https://p10.ytrss.com/product/21/468/5143/ZoomImage/36514.jpg","https://p10.ytrss.com/product/21/468/5143/ZoomImage/13736.jpg","https://p10.ytrss.com/product/21/468/5143/ZoomImage/47072.jpg","https://p10.ytrss.com/product/21/468/5143/ZoomImage/28935.jpg","https://p10.ytrss.com/product/21/468/5143/ZoomImage/791.jpg"],"sku_property":[{"url":"https://p10.ytrss.com/product/21/468/5143/ViewImage/36514.jpg","name":"颜色分类","value":"金色"},{"url":null,"name":"尺寸","value":"4.8*3.9*0.6cm"}],"property_detail":{"properties":[],"property_descriptions":[{"name":"品牌故事","description":"天鹅水晶标志是施华洛世奇的传统记号，也是施华洛世奇水晶精致优雅精神的象征。施华洛世奇公司产品的动人之处，不仅仅在于它的制品是多么巧妙地被打磨成数十个切面，以致其对光线有极好的折射能力，整个水晶制品看起来格外耀眼夺目，更在于施华洛世奇公司一直通过其产品向人们灌输着一种精致文化。\n"}]},"imageurllist":[],"gift":null,"weburl":"https://m.yintai.com/Sales/ProductDetail?itemCode=21-468-5143","isfavorite":false,"remain":387777,"endtime":null,"leftcount":2,"leftsecond":"387777.6545752","isshowfitting":0,"discount":8.5,"imageitemcode":"21-468-5143","notice":null}
         * commendlist : []
         * brandrecommand : []
         */

        private Object announcement;
        private CurrentBean current;
        private List<?> product_list;
        private List<?> commendlist;
        private List<?> brandrecommand;

        public Object getAnnouncement() {
            return announcement;
        }

        public void setAnnouncement(Object announcement) {
            this.announcement = announcement;
        }

        public CurrentBean getCurrent() {
            return current;
        }

        public void setCurrent(CurrentBean current) {
            this.current = current;
        }

        public List<?> getProduct_list() {
            return product_list;
        }

        public void setProduct_list(List<?> product_list) {
            this.product_list = product_list;
        }

        public List<?> getCommendlist() {
            return commendlist;
        }

        public void setCommendlist(List<?> commendlist) {
            this.commendlist = commendlist;
        }

        public List<?> getBrandrecommand() {
            return brandrecommand;
        }

        public void setBrandrecommand(List<?> brandrecommand) {
            this.brandrecommand = brandrecommand;
        }

        public static class CurrentBean {
            /**
             * brandid : 683
             * longname : SWAROVSKI/施华洛世奇水晶小挂件情人节礼物金色5064267全球联保
             * finalprice : 280.0
             * airrate : 0.0
             * ppatr : 0%
             * ppata : 0.0
             * description :
             * isshowdetail : 0
             * productdetailhtml : <!DOCTYPE html><html><head><title>银泰网 - 银泰百货连锁在线购物中心，银泰商业集团官方购物网站</title><meta charset='utf-8' /><meta name='viewport' content='initial-scale=1, maximum-scale=1, minimum-scale=1, width=device-width, user-scalable=no' /><meta content='yes' name='apple-mobile-web-app-capable' /><meta content='black' name='apple-mobile-web-app-status-bar-style' /><meta content='telephone=no' name='format-detection' /><meta name='keywords' content='银泰网' /><meta name='description' content='银泰网（www.yintai.com）作为银泰商业集团官方购物网站,专注经营精品时尚百货类，包括女装，男装，鞋靴，化妆品，运动系列，时尚配饰，名品箱包等万种百货商品，100%正品，15天免费退换货。银泰网作为银泰百货连锁在线购物中心，致力打造成为中国最卓越的百货购物网站！' /><link href='https://r.ytrss.com/mobile/css/style.css' rel='stylesheet'  type='text/css'><style type='text/css'>.pro-info-size{width:100%;border:1px solid #ddd;border-collapse:collapse;border-spacing:0;font-size:14px;margin-bottom:15px}.pro-info-size td{width:50%;border:1px solid #ddd;padding:10px 5px;color:#666}.pro-info-size td b{color:#333}.pro-info-title{margin:0 auto 6px;height:26px}.pro-info-title h4{float:left;width:90px;height:26px;line-height:26px;text-indent:10px;font-size:14px;font-weight:700;background:url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAJ4AAAAyCAMAAACahZLcAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAyBpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuMC1jMDYwIDYxLjEzNDc3NywgMjAxMC8wMi8xMi0xNzozMjowMCAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvIiB4bWxuczp4bXBNTT0iaHR0cDovL25zLmFkb2JlLmNvbS94YXAvMS4wL21tLyIgeG1sbnM6c3RSZWY9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9zVHlwZS9SZXNvdXJjZVJlZiMiIHhtcDpDcmVhdG9yVG9vbD0iQWRvYmUgUGhvdG9zaG9wIENTNSBXaW5kb3dzIiB4bXBNTTpJbnN0YW5jZUlEPSJ4bXAuaWlkOjYxNTAwM0I0MEY1OTExRTU4M0MxOEI5QjQ4MzlEMDM4IiB4bXBNTTpEb2N1bWVudElEPSJ4bXAuZGlkOjYxNTAwM0I1MEY1OTExRTU4M0MxOEI5QjQ4MzlEMDM4Ij4gPHhtcE1NOkRlcml2ZWRGcm9tIHN0UmVmOmluc3RhbmNlSUQ9InhtcC5paWQ6NjE1MDAzQjIwRjU5MTFFNTgzQzE4QjlCNDgzOUQwMzgiIHN0UmVmOmRvY3VtZW50SUQ9InhtcC5kaWQ6NjE1MDAzQjMwRjU5MTFFNTgzQzE4QjlCNDgzOUQwMzgiLz4gPC9yZGY6RGVzY3JpcHRpb24+IDwvcmRmOlJERj4gPC94OnhtcG1ldGE+IDw/eHBhY2tldCBlbmQ9InIiPz7mwj00AAAARVBMVEXq6ur////c3Nz+/v7s7Ozu7u7r6+v29vb9/f34+Pj19fX7+/v5+fnt7e339/fv7+/w8PDy8vL8/Pzz8/Px8fH09PT6+vp3BjvhAAAAyklEQVR42szXSRKCQBBFwUJoRAUBQe9/VAUHwHBv1gkyevNfx26+bLr4392y3xcGr7N5cbJ5o82Li83rbV5UNm+weWVF8+Jq88qc5sXR5hU5zYu9zWtsXpxtXrJ5cbB5yeZFbfM6m/dV9RxvtHnb5/N4vc3bfIpA3mDz1lUP8tZVL/JWVS/yVlVP8paqJ3lL1Zu8wuZ9qh7lNTbvXfUqL9m8V9WzvDanec/pcHnzdLi8eTpgXmHzpumQeY3Ne0wHzUs2L2qb194FGAA6iQfypDiKsQAAAABJRU5ErkJggg==) 0 0 no-repeat;background-size:100%;color:#333}.pro-info-title a{float:right;line-height:26px;font-weight:700;color:#333}.pro-info-title a span{display:inline-block;width:20px;height:20px;margin-right:5px;vertical-align:middle;background:url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACoAAAAnCAYAAAB5XdqFAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAA2hpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuMy1jMDExIDY2LjE0NTY2MSwgMjAxMi8wMi8wNi0xNDo1NjoyNyAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wTU09Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9tbS8iIHhtbG5zOnN0UmVmPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvc1R5cGUvUmVzb3VyY2VSZWYjIiB4bWxuczp4bXA9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC8iIHhtcE1NOk9yaWdpbmFsRG9jdW1lbnRJRD0ieG1wLmRpZDoyRTlBMjNFRkQ0MDhFNDExODc1MEYzQ0JFQURFQ0VCNyIgeG1wTU06RG9jdW1lbnRJRD0ieG1wLmRpZDoyQjc0QjE4NkZERkQxMUU0QTREQ0YxNzY5Q0UyRjA4MyIgeG1wTU06SW5zdGFuY2VJRD0ieG1wLmlpZDoyQjc0QjE4NUZERkQxMUU0QTREQ0YxNzY5Q0UyRjA4MyIgeG1wOkNyZWF0b3JUb29sPSJBZG9iZSBQaG90b3Nob3AgQ1M2IChNYWNpbnRvc2gpIj4gPHhtcE1NOkRlcml2ZWRGcm9tIHN0UmVmOmluc3RhbmNlSUQ9InhtcC5paWQ6MDU4MDExNzQwNzIwNjgxMTgyMkFGNjg2RTEzQzA3MjkiIHN0UmVmOmRvY3VtZW50SUQ9InhtcC5kaWQ6MkU5QTIzRUZENDA4RTQxMTg3NTBGM0NCRUFERUNFQjciLz4gPC9yZGY6RGVzY3JpcHRpb24+IDwvcmRmOlJERj4gPC94OnhtcG1ldGE+IDw/eHBhY2tldCBlbmQ9InIiPz4aEoG4AAAEUUlEQVR42sSYd2gUURDG77zYY8GSs8YaOwrmFAtYEKxYsBfsmKCgsYuKGFQIKoIF/4goothFFBUTREEUCxas2IiKDY1iSTQqJl78Br6Fcb3d2727JAM/2Ld3b/fbefPmzXvelJQUT4RWCbQGjUB1EAQF4BV4Cn55orDMzMx/2nEu+4uwCWAI6ATKW/yvCNwE2eAghUdl5Rz+ryc4Dx6B1SBgI9JwQDeQDh6DLLYjtnAeTQBbwPgQv8lQ54Bn4Cs/Oh60Ai2UE7xgIBgADoA08CmWQnuBI8Cv7hWCkxzOs+CbRd+aoB+YCIYDHwVPAn3BWHA5FkMvDzynRBaDPSAJjAbHbER66GH5zyh6+CCfIdaAzx4VrdBhFGXE4DvQH0wDLyMIr+f07GCQqzKGhMHQSIUm8+t9bN8HXemBaC2bz3rEdgW+q4NbofH8yipsP2acvfHEzl4xRnPYrgoOgYpuhK5kPBkxJsPy0RN7y+Wz89luz3c7EtoYLFD356uvLgmT0Vqs2otM2cVSaJpy/xWw18VLJe1sZ+zNcNFvJ7jFawm3eeGEyuyequ6tUanEiTUEc0CbcC8zmbxjrWrPVJM4pFCZMHXYfsFEHmmKK+ey72nwltd+LtW2Qg075tKb0dofrnSG9bcTGlDti57StwvqOmAnNEm175eB0HvquoVdUaLTwmubB1ZgiZdkul9FXSeykNGWB9bZLL9vTBPTUqhRQf1kzFjZILAijHdqgDEh7ku1P9eiz3d1XdlJmVeZoRC0+O9VxlNiiGcY936HWHJle3I4zJbGo5xlKVSWybqqUH5v8d8PXKfNlqiG9Qno6DJG/aby0HIy6dhpWwaTqbW6zrETelu1u5WBUJ3k79oJ1XlsRBkIHWaRU/8TmsVJINYFtCtFkS1BbWaFAhbXlkK/gOOqElru8mXvVBWU5bKvTOKjHPL9FGubnjaDcbyW/c02cN3hywo5EjXsZq2Fk6Qu3cGMcty2llRHOie4tRV7yJf/KKEh95qKH7/a+IUt0eapLXA77kR9JSByFngANoBqFP0hXCdfcnKyXpNlrR+pxDZlzRiMkch4HjwkMC0Jp5yMnLnQ3ccvNWwKJ4g/BiLrgTOmd8ppzA0n+Vt71LDz/OIubDcHk8Fnzk63hbVM2OmcA20sjn+mcsZfc3NSUsw90Eo15OLRXawdZzP3OUk9cxmPspGrpar6JayyjCwh+7ZNDIPa4WZ9KJMiZDdoYrpfxCG7wyObfOUdGYHOPHUxO+IZd6rGTqIZ69eAqSaWs69LboQa5d8ybqlrRhifsqhsZL42l3LizfU8S/AqR6zifAk63TXKg9NZzs3hrP3joF8R1+5U9s2wqDdlwVjIOuOTiusMTuS6Tj1qVcl3Z1nYiGnHwzz8lrF8y+VKZdS2cnDWw7RE94mLcCjzWEBkx3gxkEO03txjLWUo1AcDvcXFpbONT01NddtFjtK3ck814q8AAwBmN+66rcnZ9gAAAABJRU5ErkJggg==) 0 0 no-repeat;background-size:100%}.pro-info-text{overflow:hidden;line-height:20px;color:#666;margin-bottom:15px}.pro-info-text p{margin-bottom:5px}.pro-info-text img {vertical-align:top;width:100%}.pro-info-text .pro-ui-title{height:62px;margin-bottom:5px}.pro-info-text .pro-ui-title h5{float:left;width:40%;height:62px;line-height:62px;overflow:hidden;font-size:20px;font-weight:700;color:#333}.pro-info-text .pro-ui-title div{float:right;width:60%;overflow:hidden;border-bottom:2px solid #999}.pro-info-text .pro-ui-title div span{float:right;display:block;width:90px;height:60px}.pro-info-text .pro-dobule-images td{padding:1px}</style></head><body style='padding:10px;background:#fff'> <!-- <- 左侧body的style样式只为了此原型服务 --><br /><div class='pro-info-title'><h4>品牌故事</h4></div><div class='pro-info-text'><div class='pro-ui-title'><h5>SWAROVSKI </h5><div><span><img src='https://p10.ytrss.com/Brand/683/logo.jpg' width='100%' /></span></div></div><div class='pro-ui-text'><p>天鹅水晶标志是施华洛世奇的传统记号，也是施华洛世奇水晶精致优雅精神的象征。施华洛世奇公司产品的动人之处，不仅仅在于它的制品是多么巧妙地被打磨成数十个切面，以致其对光线有极好的折射能力，整个水晶制品看起来格外耀眼夺目，更在于施华洛世奇公司一直通过其产品向人们灌输着一种精致文化。
             </p></div></div><div class='pro-info-title'><h4>商品细节</h4></div><div class='pro-info-text'><table class='pro-dobule-images'><tr><td><img alt='Cottonshop' title='' src='https://p10.ytrss.com/product/21/468/5143/LargeImage/36514.jpg' width='100%' /></td><td><img alt='Cottonshop' title='' src='https://p10.ytrss.com/product/21/468/5143/LargeImage/13736.jpg' width='100%' /></td></tr><tr><td><img alt='Cottonshop' title='' src='https://p10.ytrss.com/product/21/468/5143/LargeImage/47072.jpg' width='100%' /></td><td><img alt='Cottonshop' title='' src='https://p10.ytrss.com/product/21/468/5143/LargeImage/28935.jpg' width='100%' /></td></tr><tr><td><img alt='Cottonshop' title='' src='https://p10.ytrss.com/product/21/468/5143/LargeImage/791.jpg' width='100%' /></td><td></td></tr></table></div></body></html>
             * productparameterhtml : <!DOCTYPE html><html><head><title>银泰网 - 银泰百货连锁在线购物中心，银泰商业集团官方购物网站</title><meta charset='utf-8' /><meta name='viewport' content='initial-scale=1, maximum-scale=1, minimum-scale=1, width=device-width, user-scalable=no' /><meta content='yes' name='apple-mobile-web-app-capable' /><meta content='black' name='apple-mobile-web-app-status-bar-style' /><meta content='telephone=no' name='format-detection' /><meta name='keywords' content='银泰网' /><meta name='description' content='银泰网（www.yintai.com）作为银泰商业集团官方购物网站,专注经营精品时尚百货类，包括女装，男装，鞋靴，化妆品，运动系列，时尚配饰，名品箱包等万种百货商品，100%正品，15天免费退换货。银泰网作为银泰百货连锁在线购物中心，致力打造成为中国最卓越的百货购物网站！' /><link href='https://r.ytrss.com/mobile/css/style.css' rel='stylesheet'  type='text/css'><style type='text/css'>.pro-info-size{width:100%;border:1px solid #ddd;border-collapse:collapse;border-spacing:0;font-size:14px;margin-bottom:15px}.pro-info-size td{width:50%;border:1px solid #ddd;padding:10px 5px;color:#666}.pro-info-size td b{color:#333}.pro-info-title{margin:0 auto 6px;height:26px}.pro-info-title h4{float:left;width:90px;height:26px;line-height:26px;text-indent:10px;font-size:14px;font-weight:700;background:url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAJ4AAAAyCAMAAACahZLcAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAyBpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuMC1jMDYwIDYxLjEzNDc3NywgMjAxMC8wMi8xMi0xNzozMjowMCAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvIiB4bWxuczp4bXBNTT0iaHR0cDovL25zLmFkb2JlLmNvbS94YXAvMS4wL21tLyIgeG1sbnM6c3RSZWY9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9zVHlwZS9SZXNvdXJjZVJlZiMiIHhtcDpDcmVhdG9yVG9vbD0iQWRvYmUgUGhvdG9zaG9wIENTNSBXaW5kb3dzIiB4bXBNTTpJbnN0YW5jZUlEPSJ4bXAuaWlkOjYxNTAwM0I0MEY1OTExRTU4M0MxOEI5QjQ4MzlEMDM4IiB4bXBNTTpEb2N1bWVudElEPSJ4bXAuZGlkOjYxNTAwM0I1MEY1OTExRTU4M0MxOEI5QjQ4MzlEMDM4Ij4gPHhtcE1NOkRlcml2ZWRGcm9tIHN0UmVmOmluc3RhbmNlSUQ9InhtcC5paWQ6NjE1MDAzQjIwRjU5MTFFNTgzQzE4QjlCNDgzOUQwMzgiIHN0UmVmOmRvY3VtZW50SUQ9InhtcC5kaWQ6NjE1MDAzQjMwRjU5MTFFNTgzQzE4QjlCNDgzOUQwMzgiLz4gPC9yZGY6RGVzY3JpcHRpb24+IDwvcmRmOlJERj4gPC94OnhtcG1ldGE+IDw/eHBhY2tldCBlbmQ9InIiPz7mwj00AAAARVBMVEXq6ur////c3Nz+/v7s7Ozu7u7r6+v29vb9/f34+Pj19fX7+/v5+fnt7e339/fv7+/w8PDy8vL8/Pzz8/Px8fH09PT6+vp3BjvhAAAAyklEQVR42szXSRKCQBBFwUJoRAUBQe9/VAUHwHBv1gkyevNfx26+bLr4392y3xcGr7N5cbJ5o82Li83rbV5UNm+weWVF8+Jq88qc5sXR5hU5zYu9zWtsXpxtXrJ5cbB5yeZFbfM6m/dV9RxvtHnb5/N4vc3bfIpA3mDz1lUP8tZVL/JWVS/yVlVP8paqJ3lL1Zu8wuZ9qh7lNTbvXfUqL9m8V9WzvDanec/pcHnzdLi8eTpgXmHzpumQeY3Ne0wHzUs2L2qb194FGAA6iQfypDiKsQAAAABJRU5ErkJggg==) 0 0 no-repeat;background-size:100%;color:#333}.pro-info-title a{float:right;line-height:26px;font-weight:700;color:#333}.pro-info-title a span{display:inline-block;width:20px;height:20px;margin-right:5px;vertical-align:middle;background:url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACoAAAAnCAYAAAB5XdqFAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAA2hpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuMy1jMDExIDY2LjE0NTY2MSwgMjAxMi8wMi8wNi0xNDo1NjoyNyAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wTU09Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9tbS8iIHhtbG5zOnN0UmVmPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvc1R5cGUvUmVzb3VyY2VSZWYjIiB4bWxuczp4bXA9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC8iIHhtcE1NOk9yaWdpbmFsRG9jdW1lbnRJRD0ieG1wLmRpZDoyRTlBMjNFRkQ0MDhFNDExODc1MEYzQ0JFQURFQ0VCNyIgeG1wTU06RG9jdW1lbnRJRD0ieG1wLmRpZDoyQjc0QjE4NkZERkQxMUU0QTREQ0YxNzY5Q0UyRjA4MyIgeG1wTU06SW5zdGFuY2VJRD0ieG1wLmlpZDoyQjc0QjE4NUZERkQxMUU0QTREQ0YxNzY5Q0UyRjA4MyIgeG1wOkNyZWF0b3JUb29sPSJBZG9iZSBQaG90b3Nob3AgQ1M2IChNYWNpbnRvc2gpIj4gPHhtcE1NOkRlcml2ZWRGcm9tIHN0UmVmOmluc3RhbmNlSUQ9InhtcC5paWQ6MDU4MDExNzQwNzIwNjgxMTgyMkFGNjg2RTEzQzA3MjkiIHN0UmVmOmRvY3VtZW50SUQ9InhtcC5kaWQ6MkU5QTIzRUZENDA4RTQxMTg3NTBGM0NCRUFERUNFQjciLz4gPC9yZGY6RGVzY3JpcHRpb24+IDwvcmRmOlJERj4gPC94OnhtcG1ldGE+IDw/eHBhY2tldCBlbmQ9InIiPz4aEoG4AAAEUUlEQVR42sSYd2gUURDG77zYY8GSs8YaOwrmFAtYEKxYsBfsmKCgsYuKGFQIKoIF/4goothFFBUTREEUCxas2IiKDY1iSTQqJl78Br6Fcb3d2727JAM/2Ld3b/fbefPmzXvelJQUT4RWCbQGjUB1EAQF4BV4Cn55orDMzMx/2nEu+4uwCWAI6ATKW/yvCNwE2eAghUdl5Rz+ryc4Dx6B1SBgI9JwQDeQDh6DLLYjtnAeTQBbwPgQv8lQ54Bn4Cs/Oh60Ai2UE7xgIBgADoA08CmWQnuBI8Cv7hWCkxzOs+CbRd+aoB+YCIYDHwVPAn3BWHA5FkMvDzynRBaDPSAJjAbHbER66GH5zyh6+CCfIdaAzx4VrdBhFGXE4DvQH0wDLyMIr+f07GCQqzKGhMHQSIUm8+t9bN8HXemBaC2bz3rEdgW+q4NbofH8yipsP2acvfHEzl4xRnPYrgoOgYpuhK5kPBkxJsPy0RN7y+Wz89luz3c7EtoYLFD356uvLgmT0Vqs2otM2cVSaJpy/xWw18VLJe1sZ+zNcNFvJ7jFawm3eeGEyuyequ6tUanEiTUEc0CbcC8zmbxjrWrPVJM4pFCZMHXYfsFEHmmKK+ey72nwltd+LtW2Qg075tKb0dofrnSG9bcTGlDti57StwvqOmAnNEm175eB0HvquoVdUaLTwmubB1ZgiZdkul9FXSeykNGWB9bZLL9vTBPTUqhRQf1kzFjZILAijHdqgDEh7ku1P9eiz3d1XdlJmVeZoRC0+O9VxlNiiGcY936HWHJle3I4zJbGo5xlKVSWybqqUH5v8d8PXKfNlqiG9Qno6DJG/aby0HIy6dhpWwaTqbW6zrETelu1u5WBUJ3k79oJ1XlsRBkIHWaRU/8TmsVJINYFtCtFkS1BbWaFAhbXlkK/gOOqElru8mXvVBWU5bKvTOKjHPL9FGubnjaDcbyW/c02cN3hywo5EjXsZq2Fk6Qu3cGMcty2llRHOie4tRV7yJf/KKEh95qKH7/a+IUt0eapLXA77kR9JSByFngANoBqFP0hXCdfcnKyXpNlrR+pxDZlzRiMkch4HjwkMC0Jp5yMnLnQ3ccvNWwKJ4g/BiLrgTOmd8ppzA0n+Vt71LDz/OIubDcHk8Fnzk63hbVM2OmcA20sjn+mcsZfc3NSUsw90Eo15OLRXawdZzP3OUk9cxmPspGrpar6JayyjCwh+7ZNDIPa4WZ9KJMiZDdoYrpfxCG7wyObfOUdGYHOPHUxO+IZd6rGTqIZ69eAqSaWs69LboQa5d8ybqlrRhifsqhsZL42l3LizfU8S/AqR6zifAk63TXKg9NZzs3hrP3joF8R1+5U9s2wqDdlwVjIOuOTiusMTuS6Tj1qVcl3Z1nYiGnHwzz8lrF8y+VKZdS2cnDWw7RE94mLcCjzWEBkx3gxkEO03txjLWUo1AcDvcXFpbONT01NddtFjtK3ck814q8AAwBmN+66rcnZ9gAAAABJRU5ErkJggg==) 0 0 no-repeat;background-size:100%}.pro-info-text{overflow:hidden;line-height:20px;color:#666;margin-bottom:15px}.pro-info-text p{margin-bottom:5px}.pro-info-text img {vertical-align:top;width:100%}.pro-info-text .pro-ui-title{height:62px;margin-bottom:5px}.pro-info-text .pro-ui-title h5{float:left;width:40%;height:62px;line-height:62px;overflow:hidden;font-size:20px;font-weight:700;color:#333}.pro-info-text .pro-ui-title div{float:right;width:60%;overflow:hidden;border-bottom:2px solid #999}.pro-info-text .pro-ui-title div span{float:right;display:block;width:90px;height:60px}.pro-info-text .pro-dobule-images td{padding:1px}</style></head><body style='padding:10px;background:#fff'> <!-- <- 左侧body的style样式只为了此原型服务 --><br /><div class='pro-info-title'><h4>商品属性</h4></div><table class='pro-info-size'></table></body></html>
             * brandlogo : https://p10.ytrss.com/Brand/683/logo.jpg
             * seckillid : 0
             * ismiaowgoods : false
             * isowntake : false
             * miaowdescription :
             * itemcode : 21-468-5143
             * name : SWAROVSKI/施华洛世奇水晶小挂件情人节礼物金色5064267全球联保
             * price : 330.0
             * yt_price : 280.0
             * score : 0
             * producttype : 3
             * instock : true
             * promotions : [{"name":"特卖","desc":["名品配饰特卖"],"promotionid":"P=27002","isgoto":true}]
             * brand : SWAROVSKI
             * small_img_urls : ["https://p10.ytrss.com/product/21/468/5143/LargeImage/36514.jpg","https://p10.ytrss.com/product/21/468/5143/LargeImage/13736.jpg","https://p10.ytrss.com/product/21/468/5143/LargeImage/47072.jpg","https://p10.ytrss.com/product/21/468/5143/LargeImage/28935.jpg","https://p10.ytrss.com/product/21/468/5143/LargeImage/791.jpg"]
             * large_img_urls : ["https://p10.ytrss.com/product/21/468/5143/ZoomImage/36514.jpg","https://p10.ytrss.com/product/21/468/5143/ZoomImage/13736.jpg","https://p10.ytrss.com/product/21/468/5143/ZoomImage/47072.jpg","https://p10.ytrss.com/product/21/468/5143/ZoomImage/28935.jpg","https://p10.ytrss.com/product/21/468/5143/ZoomImage/791.jpg"]
             * sku_property : [{"url":"https://p10.ytrss.com/product/21/468/5143/ViewImage/36514.jpg","name":"颜色分类","value":"金色"},{"url":null,"name":"尺寸","value":"4.8*3.9*0.6cm"}]
             * property_detail : {"properties":[],"property_descriptions":[{"name":"品牌故事","description":"天鹅水晶标志是施华洛世奇的传统记号，也是施华洛世奇水晶精致优雅精神的象征。施华洛世奇公司产品的动人之处，不仅仅在于它的制品是多么巧妙地被打磨成数十个切面，以致其对光线有极好的折射能力，整个水晶制品看起来格外耀眼夺目，更在于施华洛世奇公司一直通过其产品向人们灌输着一种精致文化。\n"}]}
             * imageurllist : []
             * gift : null
             * weburl : https://m.yintai.com/Sales/ProductDetail?itemCode=21-468-5143
             * isfavorite : false
             * remain : 387777
             * endtime : null
             * leftcount : 2
             * leftsecond : 387777.6545752
             * isshowfitting : 0
             * discount : 8.5
             * imageitemcode : 21-468-5143
             * notice : null
             */

            private int brandid;
            private String longname;
            private double finalprice;
            private double airrate;
            private String ppatr;
            private double ppata;
            private String description;
            private int isshowdetail;
            private String productdetailhtml;
            private String productparameterhtml;
            private String brandlogo;
            private int seckillid;
            private boolean ismiaowgoods;
            private boolean isowntake;
            private String miaowdescription;
            private String itemcode;
            private String name;
            private double price;
            private double yt_price;
            private int score;
            private String producttype;
            private boolean instock;
            private String brand;
            private PropertyDetailBean property_detail;
            private Object gift;
            private String weburl;
            private boolean isfavorite;
            private int remain;
            private Object endtime;
            private int leftcount;
            private String leftsecond;
            private int isshowfitting;
            private double discount;
            private String imageitemcode;
            private Object notice;
            private List<PromotionsBean> promotions;
            private List<String> small_img_urls;
            private List<String> large_img_urls;
            private List<SkuPropertyBean> sku_property;
            private List<?> imageurllist;

            public int getBrandid() {
                return brandid;
            }

            public void setBrandid(int brandid) {
                this.brandid = brandid;
            }

            public String getLongname() {
                return longname;
            }

            public void setLongname(String longname) {
                this.longname = longname;
            }

            public double getFinalprice() {
                return finalprice;
            }

            public void setFinalprice(double finalprice) {
                this.finalprice = finalprice;
            }

            public double getAirrate() {
                return airrate;
            }

            public void setAirrate(double airrate) {
                this.airrate = airrate;
            }

            public String getPpatr() {
                return ppatr;
            }

            public void setPpatr(String ppatr) {
                this.ppatr = ppatr;
            }

            public double getPpata() {
                return ppata;
            }

            public void setPpata(double ppata) {
                this.ppata = ppata;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public int getIsshowdetail() {
                return isshowdetail;
            }

            public void setIsshowdetail(int isshowdetail) {
                this.isshowdetail = isshowdetail;
            }

            public String getProductdetailhtml() {
                return productdetailhtml;
            }

            public void setProductdetailhtml(String productdetailhtml) {
                this.productdetailhtml = productdetailhtml;
            }

            public String getProductparameterhtml() {
                return productparameterhtml;
            }

            public void setProductparameterhtml(String productparameterhtml) {
                this.productparameterhtml = productparameterhtml;
            }

            public String getBrandlogo() {
                return brandlogo;
            }

            public void setBrandlogo(String brandlogo) {
                this.brandlogo = brandlogo;
            }

            public int getSeckillid() {
                return seckillid;
            }

            public void setSeckillid(int seckillid) {
                this.seckillid = seckillid;
            }

            public boolean isIsmiaowgoods() {
                return ismiaowgoods;
            }

            public void setIsmiaowgoods(boolean ismiaowgoods) {
                this.ismiaowgoods = ismiaowgoods;
            }

            public boolean isIsowntake() {
                return isowntake;
            }

            public void setIsowntake(boolean isowntake) {
                this.isowntake = isowntake;
            }

            public String getMiaowdescription() {
                return miaowdescription;
            }

            public void setMiaowdescription(String miaowdescription) {
                this.miaowdescription = miaowdescription;
            }

            public String getItemcode() {
                return itemcode;
            }

            public void setItemcode(String itemcode) {
                this.itemcode = itemcode;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public double getPrice() {
                return price;
            }

            public void setPrice(double price) {
                this.price = price;
            }

            public double getYt_price() {
                return yt_price;
            }

            public void setYt_price(double yt_price) {
                this.yt_price = yt_price;
            }

            public int getScore() {
                return score;
            }

            public void setScore(int score) {
                this.score = score;
            }

            public String getProducttype() {
                return producttype;
            }

            public void setProducttype(String producttype) {
                this.producttype = producttype;
            }

            public boolean isInstock() {
                return instock;
            }

            public void setInstock(boolean instock) {
                this.instock = instock;
            }

            public String getBrand() {
                return brand;
            }

            public void setBrand(String brand) {
                this.brand = brand;
            }

            public PropertyDetailBean getProperty_detail() {
                return property_detail;
            }

            public void setProperty_detail(PropertyDetailBean property_detail) {
                this.property_detail = property_detail;
            }

            public Object getGift() {
                return gift;
            }

            public void setGift(Object gift) {
                this.gift = gift;
            }

            public String getWeburl() {
                return weburl;
            }

            public void setWeburl(String weburl) {
                this.weburl = weburl;
            }

            public boolean isIsfavorite() {
                return isfavorite;
            }

            public void setIsfavorite(boolean isfavorite) {
                this.isfavorite = isfavorite;
            }

            public int getRemain() {
                return remain;
            }

            public void setRemain(int remain) {
                this.remain = remain;
            }

            public Object getEndtime() {
                return endtime;
            }

            public void setEndtime(Object endtime) {
                this.endtime = endtime;
            }

            public int getLeftcount() {
                return leftcount;
            }

            public void setLeftcount(int leftcount) {
                this.leftcount = leftcount;
            }

            public String getLeftsecond() {
                return leftsecond;
            }

            public void setLeftsecond(String leftsecond) {
                this.leftsecond = leftsecond;
            }

            public int getIsshowfitting() {
                return isshowfitting;
            }

            public void setIsshowfitting(int isshowfitting) {
                this.isshowfitting = isshowfitting;
            }

            public double getDiscount() {
                return discount;
            }

            public void setDiscount(double discount) {
                this.discount = discount;
            }

            public String getImageitemcode() {
                return imageitemcode;
            }

            public void setImageitemcode(String imageitemcode) {
                this.imageitemcode = imageitemcode;
            }

            public Object getNotice() {
                return notice;
            }

            public void setNotice(Object notice) {
                this.notice = notice;
            }

            public List<PromotionsBean> getPromotions() {
                return promotions;
            }

            public void setPromotions(List<PromotionsBean> promotions) {
                this.promotions = promotions;
            }

            public List<String> getSmall_img_urls() {
                return small_img_urls;
            }

            public void setSmall_img_urls(List<String> small_img_urls) {
                this.small_img_urls = small_img_urls;
            }

            public List<String> getLarge_img_urls() {
                return large_img_urls;
            }

            public void setLarge_img_urls(List<String> large_img_urls) {
                this.large_img_urls = large_img_urls;
            }

            public List<SkuPropertyBean> getSku_property() {
                return sku_property;
            }

            public void setSku_property(List<SkuPropertyBean> sku_property) {
                this.sku_property = sku_property;
            }

            public List<?> getImageurllist() {
                return imageurllist;
            }

            public void setImageurllist(List<?> imageurllist) {
                this.imageurllist = imageurllist;
            }

            public static class PropertyDetailBean {
                private List<?> properties;
                private List<PropertyDescriptionsBean> property_descriptions;

                public List<?> getProperties() {
                    return properties;
                }

                public void setProperties(List<?> properties) {
                    this.properties = properties;
                }

                public List<PropertyDescriptionsBean> getProperty_descriptions() {
                    return property_descriptions;
                }

                public void setProperty_descriptions(List<PropertyDescriptionsBean> property_descriptions) {
                    this.property_descriptions = property_descriptions;
                }

                public static class PropertyDescriptionsBean {
                    /**
                     * name : 品牌故事
                     * description : 天鹅水晶标志是施华洛世奇的传统记号，也是施华洛世奇水晶精致优雅精神的象征。施华洛世奇公司产品的动人之处，不仅仅在于它的制品是多么巧妙地被打磨成数十个切面，以致其对光线有极好的折射能力，整个水晶制品看起来格外耀眼夺目，更在于施华洛世奇公司一直通过其产品向人们灌输着一种精致文化。

                     */

                    private String name;
                    private String description;

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getDescription() {
                        return description;
                    }

                    public void setDescription(String description) {
                        this.description = description;
                    }
                }
            }

            public static class PromotionsBean {
                /**
                 * name : 特卖
                 * desc : ["名品配饰特卖"]
                 * promotionid : P=27002
                 * isgoto : true
                 */

                private String name;
                private String promotionid;
                private boolean isgoto;
                private List<String> desc;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getPromotionid() {
                    return promotionid;
                }

                public void setPromotionid(String promotionid) {
                    this.promotionid = promotionid;
                }

                public boolean isIsgoto() {
                    return isgoto;
                }

                public void setIsgoto(boolean isgoto) {
                    this.isgoto = isgoto;
                }

                public List<String> getDesc() {
                    return desc;
                }

                public void setDesc(List<String> desc) {
                    this.desc = desc;
                }
            }

            public static class SkuPropertyBean {
                /**
                 * url : https://p10.ytrss.com/product/21/468/5143/ViewImage/36514.jpg
                 * name : 颜色分类
                 * value : 金色
                 */

                private String url;
                private String name;
                private String value;

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getValue() {
                    return value;
                }

                public void setValue(String value) {
                    this.value = value;
                }
            }
        }
    }
}
